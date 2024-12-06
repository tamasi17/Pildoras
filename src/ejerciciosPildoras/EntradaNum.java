package ejerciciosPildoras;

import javax.swing.JOptionPane;

public class EntradaNum {

	public static void main(String[] args) {

		String num1 = JOptionPane.showInputDialog("Introduce un numero:");
		
		double x=Double.parseDouble(num1);
		
		System.out.println("La raiz de " + x + " es: ");
		
		System.out.printf("%1.2f", Math.sqrt(x));
	}

}
