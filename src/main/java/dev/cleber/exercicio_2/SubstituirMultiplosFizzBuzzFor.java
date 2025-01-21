package dev.cleber.exercicio_2;

public class SubstituirMultiplosFizzBuzzFor {

	public static void main(String[] args) {

		for (int numero = 1; numero <= 100; numero++) {

			if (numero % 3 == 0 && numero % 5 == 0) {
				/* para os multiplos de 3 e 5 imprima */
				System.out.println("FizzBuzz = " + numero + " ");

			} else if (numero % 3 == 0) {

				System.out.println("Fizz = " + numero + "");

			} else if (numero % 5 == 0) {

				System.out.println("Buzz = " + numero + " ");

			} else {

				System.out.println(numero + " ");

			}

		}
	}

}
