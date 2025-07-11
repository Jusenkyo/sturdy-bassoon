package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Transporte;

public class Tren extends Transporte {
    public Tren() {
        super("Tren", 120, 0.25); // Rápido y económico
    }

    @Override
    public String transportar() {
        return "Viajando en vías férreas a " + velocidadMaxima + " km/h";
    }
}