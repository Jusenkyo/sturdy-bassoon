package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Transporte;

public class Camion extends Transporte {
    public Camion() {
        super("Camión", 80, 0.3); // Velocidad media, costo medio
    }

    @Override
    public String transportar() {
        return "Rodando por carretera a " + velocidadMaxima + " km/h";
    }
}