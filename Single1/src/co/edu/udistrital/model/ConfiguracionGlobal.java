package co.edu.udistrital.model;

public class ConfiguracionGlobal {
    private static ConfiguracionGlobal instancia = null;
    private String idioma = "español";
    private String tema = "claro";
    private int tiempoInactividad = 30;

    private ConfiguracionGlobal() {
        // Constructor privado para evitar instanciación
    }

    public static ConfiguracionGlobal getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionGlobal();
        }
        return instancia;
    }

    // Getters y Setters
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getTiempoInactividad() {
        return tiempoInactividad;
    }

    public void setTiempoInactividad(int tiempoInactividad) {
        this.tiempoInactividad = tiempoInactividad;
    }
}
