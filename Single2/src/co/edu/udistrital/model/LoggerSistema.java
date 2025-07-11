package co.edu.udistrital.model;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggerSistema {
    private static LoggerSistema instancia = null;
    private FileWriter writer;
    private SimpleDateFormat dateFormat;

    private LoggerSistema() {
        try {
            writer = new FileWriter("system_log.txt", true);
            dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static LoggerSistema getInstancia() {
        if (instancia == null) {
            instancia = new LoggerSistema();
        }
        return instancia;
    }

    public void log(String mensaje) {
        try {
            String fecha = dateFormat.format(new Date());
            writer.write(fecha + " - " + mensaje + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cerrarLogger() {
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}