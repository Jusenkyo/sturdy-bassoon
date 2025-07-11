package co.edu.udistrital.model;

import co.edu.udistrital.model.fabricaAbstracta.Envio;

public class EnvioAereo implements Envio {
    @Override
    public String calcularCosto(double peso, double distancia) {
        double costo = peso * 1.5 + distancia * 0.3;
        return "Costo aéreo: $" + costo;
    }

    @Override
    public String estimarTiempo(double distancia) {
        double tiempo = distancia / 800; // km/h promedio (avión)
        return "Tiempo estimado aéreo: " + tiempo + " horas";
    }

    @Override
    public String tipoTransporte() {
        return "Transporte: Avión";
    }
}