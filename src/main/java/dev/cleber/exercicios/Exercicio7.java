package dev.cleber.exercicios;

import java.util.Scanner;

public class Exercicio7 {
	
	/*7. Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma
		mensagem que diga se ela poderá ou não votar este ano.
	 */

	public static void main(String[] args) {

		int anoAtual = 2024;
		int anoNascimento = 2012;
		int podeVotar = anoAtual - anoNascimento;

		if (podeVotar < 18) {
			System.out.println("Voce é menor ainda, esse ano voce nao poderá votar");

		} else {
			System.out.println("Voce poderá votar esse ano.");
		}
		
		/*scanner*/
		
		Scanner voto = new Scanner(System.in);

		System.out.println("Digite seu ano de nascimento.");
		int nascimento = voto.nextInt();

		int idade = anoAtual - nascimento;

		if (idade >= 18) {
			System.out.println("Voce tem " + idade + " anos de idade, voce pode votar.");

		} else {
			System.out.println("Voce tem "+ idade+ " anos de idade, ainda é menor, então nao pode votar, ainda.");

		}
		voto.close();

	}

}
