package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Figura;

public class Circulo extends Figura {
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String describir() {
        return String.format("Círculo [Radio=%.2f, Área=%.2f, Perímetro=%.2f]", 
                            radio, calcularArea(), calcularPerimetro());
    }
}