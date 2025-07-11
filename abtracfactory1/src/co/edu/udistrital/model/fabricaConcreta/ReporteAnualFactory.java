package co.edu.udistrital.model.fabricaConcreta;

import co.edu.udistrital.model.ReporteAnual;
import co.edu.udistrital.model.fabricaAbstracta.ReporteFactory;
import co.edu.udistrital.model.fabricaAbstracta.Reporte;

public class ReporteAnualFactory implements ReporteFactory {
    @Override
    public Reporte crearReporte() {
        return new ReporteAnual();
    }
}