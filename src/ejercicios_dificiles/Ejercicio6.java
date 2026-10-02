package ejercicios_dificiles;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Introuduce tu dia de nacimiento");
		String dia =input.nextLine();
		
		System.out.println("Introduce tu mes de nacimiento");
		String mes =input.nextLine();
				
		System.out.println("Introduce tu año de nacimiento");
		String año =input.nextLine();
		
		System.out.println("Tu fecha de nacimiento es: " + dia + " de " + mes + " del " + año);
		
		input.close();
	}

}
