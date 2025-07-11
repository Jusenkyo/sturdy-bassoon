package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Figura;

public class TrianguloFig extends Figura {
    private final double base;
    private final double altura;
    private final double lado3;

    public TrianguloFig(double base, double altura, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return base + altura + lado3;
    }

    @Override
    public String describir() {
        return String.format("Triángulo [Base=%.2f, Altura=%.2f, Lado3=%.2f, Área=%.2f, Perímetro=%.2f]",
                            base, altura, lado3, calcularArea(), calcularPerimetro());
    }
}