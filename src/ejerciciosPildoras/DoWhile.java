package ejerciciosPildoras;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {


				Scanner scanner = new Scanner(System.in);
				
				int aleatorio = (int) (Math.random()*100);
				
				
				int numero=0;
				int intentos=0;
				
				do {
				
					intentos++;
					System.out.println("Dame un número del 1 al 100");
					
					numero=scanner.nextInt();
					
					if (aleatorio<numero){
						
						System.out.println("Busca uno mas bajo");
					} else if (aleatorio>numero) {

						System.out.println("Busca uno mas alto");
					}
				} while (numero!=aleatorio);
				

				System.out.println("Correcto, lo has conseguido en " + intentos + " intentos.");
				
		}


}
