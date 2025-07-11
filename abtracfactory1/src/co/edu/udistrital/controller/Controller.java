package co.edu.udistrital.controller;

import co.edu.udistrital.model.fabricaAbstracta.*;
import co.edu.udistrital.model.fabricaConcreta.*;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
    private VistaConsola vista;
    
    public Controller() {
        vista = new VistaConsola();
    }
    
    public void run() {
        int opcion = 0;
        do {
            vista.mostrarMenu();
            opcion = vista.leerDatoEntero("");
            
            switch(opcion) {
                case 1:
                    generarReporte(new ReporteMensualFactory());
                    break;
                case 2:
                    generarReporte(new ReporteTrimestralFactory());
                    break;
                case 3:
                    generarReporte(new ReporteAnualFactory());
                    break;
                case 4:
                    vista.mostrarInformacion("Saliendo del sistema de reportes...");
                    System.exit(0);
                default:
                    vista.mostrarInformacion("Opción no válida. Intente nuevamente.");
            }
        } while(opcion != 4);
    }
    
    private void generarReporte(ReporteFactory factory) {
        Reporte reporte = factory.crearReporte();
        
        vista.mostrarInformacion("\n=== PROCESO DE REPORTE ===");
        vista.mostrarInformacion(reporte.validarDatos());
        vista.mostrarInformacion(reporte.generarReporte());
        vista.mostrarInformacion(reporte.exportarFormato());
        vista.mostrarInformacion("=== PROCESO COMPLETADO ===\n");
    }
}
