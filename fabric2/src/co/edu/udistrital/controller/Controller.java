package co.edu.udistrital.controller;

import co.edu.udistrital.model.abstracto.*;
import co.edu.udistrital.model.concretoCreador.*;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
    private VistaConsola vista;

    public Controller() {
        vista = new VistaConsola();
    }

    public void run() {
        vista.mostrarInformacion("=== SISTEMA DE TRANSPORTE ===");
        
        String tipo = vista.leerDatoString(
            "Seleccione transporte (AVION/BARCO/CAMION/TREN): "
        ).toUpperCase();
        
        double distancia = vista.leerDatoDouble("Distancia a recorrer (km): ");

        TransporteFactory fabrica = new CreadorTransporte();
        Transporte transporte = fabrica.crearTransporte(tipo);

        vista.mostrarInformacion("\n--- RESULTADOS ---");
        vista.mostrarInformacion("Tipo: " + transporte.getTipo());
        vista.mostrarInformacion(transporte.transportar());
        vista.mostrarInformacion("Costo estimado: $" + transporte.calcularCosto(distancia));
        vista.mostrarInformacion("Tiempo estimado: " + transporte.calcularTiempo(distancia) + " horas");
    }
}