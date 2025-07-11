package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Transporte;

public class Barco extends Transporte {
    public Barco() {
        super("Barco", 50, 0.2); // Más lento pero más barato
    }

    @Override
    public String transportar() {
        return "Navegando por el mar a " + velocidadMaxima + " km/h";
    }
}