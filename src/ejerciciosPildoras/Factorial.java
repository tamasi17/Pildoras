package ejerciciosPildoras;

import javax.swing.*;						
public class Factorial {

	public static void main(String[] args) {

	int resultado=1;
	
	int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		
	for (int i=numero; i>0; i--) {
		
		resultado*=i;
	}
	
	System.out.println("El factorial de " + numero + " es " + resultado);
	
	
	}

}
