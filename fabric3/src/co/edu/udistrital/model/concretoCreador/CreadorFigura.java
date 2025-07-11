package co.edu.udistrital.model.concretoCreador;

import co.edu.udistrital.model.Circulo;
import co.edu.udistrital.model.Cuadrado;
import co.edu.udistrital.model.Rectangulo;
import co.edu.udistrital.model.TrianguloFig;
import co.edu.udistrital.model.abstracto.*;

public class CreadorFigura implements FiguraFactory {
    @Override
    public Figura crearFigura(String tipo, double... parametros) {
        return switch(tipo.toUpperCase()) {
            case "CIRCULO" -> new Circulo(parametros[0]);
            case "CUADRADO" -> new Cuadrado(parametros[0]);
            case "TRIANGULO" -> new TrianguloFig(parametros[0], parametros[1], parametros[2]);
            case "RECTANGULO" -> new Rectangulo(parametros[0], parametros[1]);
            default -> throw new IllegalArgumentException("Tipo de figura no válido: " + tipo);
        };
    }
}