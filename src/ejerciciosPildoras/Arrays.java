package ejerciciosPildoras;

public class Arrays {

	public static void main(String[] args) {

		int [] arrayUno = new int[150];
		
		for (int i=0; i<arrayUno.length;i++) {
			
			arrayUno[i]= (int) Math.round(Math.random()*100);
		}
		
		for (int numeros:arrayUno) {          // bucle for each a partir de java 5 -- for (tipo elementos:miArray) {}
			System.out.print(numeros + ", ");
		}
		
	}

}
