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

	public String leerDatoString(String mensaje) {
		String string1 ;
		System.out.print(mensaje);
		string1 = sc.next();
		return string1;
	}

}
