package dev.cleber.loop;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		
		do {
			System.out.println("Digite u m numero entre 1 e 10.");
			numero = scanner.nextInt();
			
		} while (numero < 1 || numero > 10 );
		
		System.out.println("O numero digitado e valido é foi " + numero );
		
		scanner.close();
	}

}
