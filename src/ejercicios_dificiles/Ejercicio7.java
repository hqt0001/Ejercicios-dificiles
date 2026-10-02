package ejercicios_dificiles;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce una frase");
		
		String cadena1 = input.nextLine();
		
		
		
		System.out.println(cadena1.replace(" ",""));
		
		input.close();
	}

}
