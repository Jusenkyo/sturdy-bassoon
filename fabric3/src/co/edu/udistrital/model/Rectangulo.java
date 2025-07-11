package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Figura;

public class Rectangulo extends Figura {
    private final double largo;
    private final double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return largo * ancho;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largo + ancho);
    }

    @Override
    public String describir() {
        return String.format("Rectángulo [Largo=%.2f, Ancho=%.2f, Área=%.2f, Perímetro=%.2f]",
                            largo, ancho, calcularArea(), calcularPerimetro());
    }
}