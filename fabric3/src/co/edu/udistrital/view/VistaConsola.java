package co.edu.udistrital.view;

import java.util.Scanner;

public class VistaConsola {
    private final Scanner sc;

    public VistaConsola() {
        sc = new Scanner(System.in);
    }

    public void mostrarInformacion(String mensaje) {
        System.out.println(mensaje);
    }

    public String leerDatoString(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }

    public double leerDatoDouble(String mensaje) {
        System.out.print(mensaje);
        return Double.parseDouble(sc.nextLine());
    }
}
