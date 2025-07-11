package co.edu.udistrital.view;

public class VistaConfiguracion {
    public void mostrarConfiguracion(String idioma, String tema, int tiempo) {
        System.out.println("Configuración actual del sistema:");
        System.out.println("Idioma: " + idioma);
        System.out.println("Tema: " + tema);
        System.out.println("Tiempo de inactividad: " + tiempo + " minutos");
    }
    
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
