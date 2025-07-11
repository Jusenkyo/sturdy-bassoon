package co.edu.udistrital.controller;

import co.edu.udistrital.model.abstracto.Figura;
import co.edu.udistrital.model.concretoCreador.CreadorFigura;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
    private final VistaConsola vista;
    private final CreadorFigura fabrica;

    public Controller() {
        vista = new VistaConsola();
        fabrica = new CreadorFigura();
    }

    public void run() {
        vista.mostrarInformacion("\n=== CALCULADORA DE FIGURAS GEOMÉTRICAS ===");
        
        String tipo = vista.leerDatoString("Tipo de figura (CIRCULO/CUADRADO/TRIANGULO/RECTANGULO): ");
        
        Figura figura = switch(tipo.toUpperCase()) {
            case "CIRCULO" -> {
                double radio = vista.leerDatoDouble("Radio: ");
                yield fabrica.crearFigura(tipo, radio);
            }
            case "CUADRADO" -> {
                double lado = vista.leerDatoDouble("Lado: ");
                yield fabrica.crearFigura(tipo, lado);
            }
            case "TRIANGULO" -> {
                double base = vista.leerDatoDouble("Base: ");
                double altura = vista.leerDatoDouble("Altura: ");
                double lado3 = vista.leerDatoDouble("Lado 3: ");
                yield fabrica.crearFigura(tipo, base, altura, lado3);
            }
            case "RECTANGULO" -> {
                double largo = vista.leerDatoDouble("Largo: ");
                double ancho = vista.leerDatoDouble("Ancho: ");
                yield fabrica.crearFigura(tipo, largo, ancho);
            }
            default -> throw new IllegalArgumentException("Figura no soportada");
        };

        vista.mostrarInformacion("\nRESULTADO:\n" + figura.describir());
    }
}