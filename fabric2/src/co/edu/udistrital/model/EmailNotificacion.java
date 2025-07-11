package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Notificacion;

public class EmailNotificacion extends Notificacion {
    @Override
    public String enviar(String mensaje) {
        return "Enviando EMAIL: " + mensaje;
    }
}