package co.edu.udistrital.model.fabricaAbstracta;

public interface Envio {
    String calcularCosto(double peso, double distancia);
    String estimarTiempo(double distancia);
    String tipoTransporte();
}