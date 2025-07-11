package co.edu.udistrital.controller;

import co.edu.udistrital.model.abstracto.*;
import co.edu.udistrital.model.concretoCreador.*;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
    private VistaConsola vista;
    
    public Controller() {
        vista = new VistaConsola();
    }
    
    public void run() {
        vista.mostrarInformacion("SISTEMA DE NOTIFICACIONES");
        String tipo = vista.leerDatoString("Tipo de notificación (EMAIL/SMS/PUSH): ");
        String mensaje = vista.leerDatoString("Mensaje a enviar: ");
        
        NotificacionFactory fabrica = new CreadorNotificacion();
        Notificacion notificacion = fabrica.crearNotificacion(tipo);
        
        vista.mostrarInformacion("Enviando notificación: " + notificacion.enviar(mensaje));
    }
}
