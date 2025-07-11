package co.edu.udistrital.model.abstracto;

public interface TransporteFactory {
    Transporte crearTransporte(String tipo);
}