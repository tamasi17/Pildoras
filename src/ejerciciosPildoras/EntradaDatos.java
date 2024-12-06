package ejerciciosPildoras;

import javax.swing.JOptionPane;  // a partir de java9 es modular y ha pasado al java.desktop, tienes que ponerlo en el module-info del src

public class EntradaDatos {

	public static void main(String[] args) {
		
		String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre porfa"); // abre panel, devuelve string
		
		String edad = JOptionPane.showInputDialog("Tu edad");
		
		int edadUsuario = Integer.parseInt(edad); // busca el integer dentro del string. es static, no necesitas crear objeto, solo llamar a la clase.
		
		System.out.println("Hola " + nombreUsuario + ". El año que viene cumples..." + (edadUsuario+1) + "!!");

	}

}
