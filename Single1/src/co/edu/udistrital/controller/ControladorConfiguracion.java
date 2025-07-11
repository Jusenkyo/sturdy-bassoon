package co.edu.udistrital.controller;

import co.edu.udistrital.model.ConfiguracionGlobal;
import co.edu.udistrital.view.VistaConfiguracion;

public class ControladorConfiguracion {
    private VistaConfiguracion vista;
    private ConfiguracionGlobal configuracion;

    public ControladorConfiguracion() {
        vista = new VistaConfiguracion();
        configuracion = ConfiguracionGlobal.getInstancia();
    }

    public void run() {
        // Mostrar configuración inicial
        vista.mostrarConfiguracion(
            configuracion.getIdioma(),
            configuracion.getTema(),
            configuracion.getTiempoInactividad()
        );
        
        // Modificar configuración
        configuracion.setTema("oscuro");
        configuracion.setTiempoInactividad(45);
        
        // Obtener otra instancia (debería ser la misma)
        ConfiguracionGlobal otraConfig = ConfiguracionGlobal.getInstancia();
        vista.mostrarMensaje("\nConfiguración después de cambios:");
        vista.mostrarConfiguracion(
            otraConfig.getIdioma(),
            otraConfig.getTema(),
            otraConfig.getTiempoInactividad()
        );
    }
}