package co.edu.udistrital.model;

import co.edu.udistrital.model.fabricaAbstracta.Envio;

public class EnvioTerrestre implements Envio {
    @Override
    public String calcularCosto(double peso, double distancia) {
        double costo = peso * 0.5 + distancia * 0.1;
        return "Costo terrestre: $" + costo;
    }

    @Override
    public String estimarTiempo(double distancia) {
        double tiempo = distancia / 60; // km/h promedio
        return "Tiempo estimado terrestre: " + tiempo + " horas";
    }

    @Override
    public String tipoTransporte() {
        return "Transporte: Camión";
    }
}