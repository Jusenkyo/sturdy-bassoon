package co.edu.udistrital.model.abstracto;

public abstract class Transporte {
    protected String tipo;
    protected double velocidadMaxima;
    protected double costoPorKm;

    public Transporte(String tipo, double velocidadMaxima, double costoPorKm) {
        this.tipo = tipo;
        this.velocidadMaxima = velocidadMaxima;
        this.costoPorKm = costoPorKm;
    }

    public abstract String transportar(); // Método abstracto

    public double calcularCosto(double distancia) {
        return distancia * costoPorKm;
    }

    public double calcularTiempo(double distancia) {
        return distancia / velocidadMaxima;
    }

    public String getTipo() {
        return tipo;
    }
}