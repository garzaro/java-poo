package dev.cleber.exercicio_2;

public class SomaUmACemWhile {

	public static void main(String[] args) {

		int i = 1;
		int soma = 0;

		while (i <= 10) {

			soma += i;

			i++;

		}
		System.out.println("Somando " + soma);

	}

}
