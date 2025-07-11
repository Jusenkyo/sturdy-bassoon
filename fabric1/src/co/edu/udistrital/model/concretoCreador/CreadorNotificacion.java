package co.edu.udistrital.model.concretoCreador;

import co.edu.udistrital.model.EmailNotificacion;
import co.edu.udistrital.model.PushNotificacion;
import co.edu.udistrital.model.SMSNotificacion;
import co.edu.udistrital.model.abstracto.*;

public class CreadorNotificacion implements NotificacionFactory {
    @Override
    public Notificacion crearNotificacion(String tipo) {
        switch(tipo.toUpperCase()) {
            case "EMAIL":
                return new EmailNotificacion();
            case "SMS":
                return new SMSNotificacion();
            case "PUSH":
                return new PushNotificacion();
            default:
                throw new IllegalArgumentException("Tipo de notificación no válido");
        }
    }
}