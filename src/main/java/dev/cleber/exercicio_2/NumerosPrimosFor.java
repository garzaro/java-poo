package dev.cleber.exercicio_2;

public class NumerosPrimosFor {

	public static void main(String[] args) {

		for (int numero = 2; numero <= 50; numero++) {

			/* precisamos saber se o numero é ou nao primo */
			boolean ehPrimo = true;

			for (int j = 2; j < numero; j++) {

				if (numero % j == 0) {

					ehPrimo = false;

					break;

				}

			}

			if (ehPrimo) {

				System.out.println("O número " + numero + " é primo");
			}

		}

	}

}
