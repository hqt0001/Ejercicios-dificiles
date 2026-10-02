package ejercicios_dificiles;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		 System.out.println("Introduce un número de 5 cifras");
		 String num1 = input.nextLine();
		
		
		 
		 System.out.println(num1.substring(0, 1));
		 System.out.println(num1.substring(0, 2));
		 System.out.println(num1.substring(0, 3));
		 System.out.println(num1.substring(0, 4));
		 System.out.println(num1.substring(0, 5));
		
		
		
		input.close();
	}
}