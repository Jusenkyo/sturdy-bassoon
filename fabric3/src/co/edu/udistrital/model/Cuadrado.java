package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Figura;

public class Cuadrado extends Figura {
    private final double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public String describir() {
        return String.format("Cuadrado [Lado=%.2f, Área=%.2f, Perímetro=%.2f]", 
                            lado, calcularArea(), calcularPerimetro());
    }
}