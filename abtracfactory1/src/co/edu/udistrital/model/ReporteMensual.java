package co.edu.udistrital.model;

import co.edu.udistrital.model.fabricaAbstracta.Reporte;

public class ReporteMensual implements Reporte {
    @Override
    public String generarReporte() {
        return "Generando reporte mensual con datos del último mes...";
    }
    
    @Override
    public String exportarFormato() {
        return "Exportando reporte mensual a formato PDF estándar...";
    }
    
    @Override
    public String validarDatos() {
        return "Validando consistencia de datos mensuales...";
    }

}