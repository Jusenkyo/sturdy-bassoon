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
        System.out.print(mensaje);
        return sc.nextInt();
    }

    public double leerDatoDouble(String mensaje) {
        System.out.print(mensaje);
        return sc.nextDouble();
    }
}