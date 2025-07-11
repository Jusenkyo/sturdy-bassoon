package co.edu.udistrital.model.abstracto;

public interface FiguraFactory {
    Figura crearFigura(String tipo, double... parametros);
}