package ejerciciosPildoras;

import java.util.Scanner;
import javax.swing.*;

public class AccesoApp {

	public static void main(String[] args) {

		String password = "Mats";
		
		String respuesta="";
		
		while (respuesta.equals(password)==false) {
			
			respuesta = JOptionPane.showInputDialog("Introduce la contraseña, por favor");
			
			if (respuesta.equals(password)==false) {
				System.out.println("Contraseña incorrecta");
			}
			
			
		}
		
		System.out.println("Contraseña correcta! Acceso permitido.");
	}

}
