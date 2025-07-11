package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Notificacion;

public class PushNotificacion extends Notificacion {
    @Override
    public String enviar(String mensaje) {
        return "Enviando Push: " + mensaje;
    }
}