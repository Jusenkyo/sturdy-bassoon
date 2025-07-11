package co.edu.udistrital.model;

import co.edu.udistrital.model.fabricaAbstracta.Reporte;

public class ReporteTrimestral implements Reporte {
    @Override
    public String generarReporte() {
        return "Generando reporte trimestral consolidado...";
    }
    
    @Override
    public String exportarFormato() {
        return "Exportando reporte trimestral a formato Excel avanzado...";
    }
    
    @Override
    public String validarDatos() {
        return "Validando consistencia de datos trimestrales y comparando con períodos anteriores...";
    }
}