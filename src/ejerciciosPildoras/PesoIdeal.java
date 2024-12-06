package ejerciciosPildoras;

import javax.swing.*;

public class PesoIdeal {

	public static void main(String[] args) {

	String genero="";
	
	do {
		genero = JOptionPane.showInputDialog("Introduce tu genero (H/M/NB)");
		
		
	} while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false && genero.equalsIgnoreCase("NB")==false);
	
	
	int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
	
	int pesoIdeal=0;
	
	if (genero.equalsIgnoreCase("H")) {
		
		pesoIdeal = altura-110;
		
	} else if (genero.equalsIgnoreCase("M")) {
		
		pesoIdeal = altura-120;
		 
	} else if (genero.equalsIgnoreCase("NB")) {
		
		pesoIdeal = altura*3;
		
		System.out.println("Eres una bestia parda:");
	}
		
	System.out.println("Tu peso ideal es: " + pesoIdeal + " kgs.");
	
	
	}

}
