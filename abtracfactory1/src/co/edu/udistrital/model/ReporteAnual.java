package co.edu.udistrital.model;

import co.edu.udistrital.model.fabricaAbstracta.Reporte;

public class ReporteAnual implements Reporte {
    @Override
    public String generarReporte() {
        return "Generando reporte anual con análisis comparativo...";
    }
    
    @Override
    public String exportarFormato() {
        return "Exportando reporte anual a formato PDF ejecutivo y Excel detallado...";
    }
    
    @Override
    public String validarDatos() {
        return "Validando consistencia de datos anuales y auditoría preliminar...";
    }

}
