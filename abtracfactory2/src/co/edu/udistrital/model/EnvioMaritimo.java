package co.edu.udistrital.model;

import co.edu.udistrital.model.fabricaAbstracta.Envio;

public class EnvioMaritimo implements Envio {
    @Override
    public String calcularCosto(double peso, double distancia) {
        double costo = peso * 0.8 + distancia * 0.05;
        return "Costo marítimo: $" + costo;
    }

    @Override
    public String estimarTiempo(double distancia) {
        double tiempo = distancia / 30; // km/h promedio (barco)
        return "Tiempo estimado marítimo: " + tiempo + " horas";
    }

    @Override
    public String tipoTransporte() {
        return "Transporte: Barco";
    }
}