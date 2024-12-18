package dev.cleber.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		double numero = 0;

		if (numero > 0) {

			System.out.println("O número " + numero + " é positivo.");

		} else if (numero < 0) {

			System.out.println("O número " + numero + " é negativo.");

		}else {
			
			System.out.println("O número é zero.");
			
		}
		
		/*scanner*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número.");
		double number = scanner.nextDouble();
		
		if (number > 0) {

			System.out.println("O número " + number + " é positivo.");

		} else if (number < 0) {

			System.out.println("O número " + number + " é negativo.");

		}else {
			
			System.out.println("O número é zero.");
			
		}
		scanner.close();
	}
}
