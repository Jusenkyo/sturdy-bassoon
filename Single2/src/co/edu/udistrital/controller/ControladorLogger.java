package co.edu.udistrital.controller;

import co.edu.udistrital.model.LoggerSistema;
import co.edu.udistrital.view.VistaLogger;

public class ControladorLogger {
    private VistaLogger vista;
    private LoggerSistema logger;

    public ControladorLogger() {
        vista = new VistaLogger();
        logger = LoggerSistema.getInstancia();
    }

    public void run() {
        logger.log("Inicio de la aplicación");
        vista.mostrarMensaje("Mensaje de inicio registrado en el log");
        
        logger.log("Procesando datos...");
        vista.mostrarMensaje("Proceso intermedio registrado");
        
        logger.log("Finalización de la aplicación");
        vista.mostrarMensaje("Mensaje de finalización registrado");
        
        // Intentar crear otra instancia
        LoggerSistema otroLogger = LoggerSistema.getInstancia();
        otroLogger.log("Mensaje desde 'otra' instancia");
        vista.mostrarMensaje("Verificar que ambos mensajes van al mismo archivo de log");
        
        logger.cerrarLogger();
    }
}