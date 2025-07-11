package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Transporte;

public class Avion extends Transporte {
    public Avion() {
        super("Avión", 900, 0.5); // Velocidad en km/h, costo por km
    }

    @Override
    public String transportar() {
        return "Volando por el aire a " + velocidadMaxima + " km/h";
    }
}