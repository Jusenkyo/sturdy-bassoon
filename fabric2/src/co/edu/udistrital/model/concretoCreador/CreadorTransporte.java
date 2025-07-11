package co.edu.udistrital.model.concretoCreador;

import co.edu.udistrital.model.Avion;
import co.edu.udistrital.model.Barco;
import co.edu.udistrital.model.Camion;
import co.edu.udistrital.model.Tren;
import co.edu.udistrital.model.abstracto.*;

public class CreadorTransporte implements TransporteFactory {
    @Override
    public Transporte crearTransporte(String tipo) {
        switch(tipo.toUpperCase()) {
            case "AVION":
                return new Avion();
            case "BARCO":
                return new Barco();
            case "CAMION":
                return new Camion();
            case "TREN":
                return new Tren();
            default:
                throw new IllegalArgumentException("Tipo de transporte no válido: " + tipo);
        }
    }
}