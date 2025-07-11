package co.edu.udistrital.view;

import java.util.Scanner;

public class VistaConsola {
    private Scanner sc;
    
    public VistaConsola() {
        sc = new Scanner(System.in);
    }
    
    public void mostrarInformacion(String mensaje) {
        System.out.println(mensaje);
    }
    
    public int leerDatoEntero(String mensaje) {
        int dato = 0;
        System.out.print(mensaje);
        dato = sc.nextInt();
        return dato;
    }
    
    public void mostrarMenu() {
        String menu = "\nMENU DE REPORTES FINANCIEROS\n"
                + "1. Generar Reporte Mensual\n"
                + "2. Generar Reporte Trimestral\n"
                + "3. Generar Reporte Anual\n"
                + "4. Salir\n\n"
                + "Seleccione opción: ";
        System.out.print(menu);
    }
}