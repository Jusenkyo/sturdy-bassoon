package co.edu.udistrital.controller;

import co.edu.udistrital.model.fabricaAbstracta.EnvioFactory;
import co.edu.udistrital.model.fabricaAbstracta.Envio;
import co.edu.udistrital.model.fabricaConcreta.*;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
    private VistaConsola vista;

    public Controller() {
        vista = new VistaConsola();
    }

    public void run() {
        int opcion;
        do {
            opcion = vista.leerDatoEntero(
                "SISTEMA DE ENVÍOS\n" +
                "1. Envío Terrestre\n" +
                "2. Envío Aéreo\n" +
                "3. Envío Marítimo\n" +
                "4. Salir\n" +
                "Seleccione una opción: "
            );

            if (opcion >= 1 && opcion <= 3) {
                double peso = vista.leerDatoEntero("Ingrese peso del paquete (kg): ");
                double distancia = vista.leerDatoEntero("Ingrese distancia (km): ");
                procesarEnvio(opcion, peso, distancia);
            } else if (opcion != 4) {
                vista.mostrarInformacion("Opción inválida.");
            }
        } while (opcion != 4);
    }

    private void procesarEnvio(int tipoEnvio, double peso, double distancia) {
        EnvioFactory factory = null;
        
        switch (tipoEnvio) {
            case 1: factory = new EnvioTerrestreFactory(); break;
            case 2: factory = new EnvioAereoFactory(); break;
            case 3: factory = new EnvioMaritimoFactory(); break;
        }

        if (factory != null) {
            Envio envio = factory.crearEnvio();
            vista.mostrarInformacion(envio.tipoTransporte());
            vista.mostrarInformacion(envio.calcularCosto(peso, distancia));
            vista.mostrarInformacion(envio.estimarTiempo(distancia));
        }
    }
}