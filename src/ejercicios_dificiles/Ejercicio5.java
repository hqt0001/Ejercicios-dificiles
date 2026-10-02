package ejercicios_dificiles;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introuduce el radio");
		double radio = input.nextInt();
		
		
		double longitud = 2 * Math.PI * radio;
		System.out.println("La longitud de la circunferencia es: "+ longitud);

		
		double area = Math.PI * Math.pow(radio, 2);
		System.out.println("El area de la circunferencia es: "+ area);
		
		input.close();
	}

}
