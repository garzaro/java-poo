package dev.cleber.exercicios;

import java.util.Scanner;

public class Exercicio8_1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantas laranjas voce quer?");
		
		int quantidadeDeFrutas = scanner.nextInt();
		
		double precoUnitario;
		
		if (quantidadeDeFrutas < 12 ) {
			
			precoUnitario = 0.30;
			
			System.out.println();
		
		} else {
			
			precoUnitario = 0.25;

		}
		
		double valorDaCompra = quantidadeDeFrutas * precoUnitario;
		
		System.out.println("Valora da compra é R$ " + valorDaCompra);
		
		scanner.close();
	}

}
