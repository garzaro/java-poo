package dev.cleber.loop;

import java.util.Scanner;

// % operador de modo.

public class LoopWhile {

	/* laço de repetição */
	public static void main(String[] args) {

		/* while geralmente precisa de um contador */

		int contador = 2; /* hard coded = valor diretamente no codigo */
		int value = 0;

		while (value <= contador) {

			System.out.println(value);
			
			value += 1;

		}
		
		System.out.println("----------------------------------");
		
		/*scanner*/

		Scanner counter = new Scanner(System.in);

		System.out.println("Digite um número inteiro qualquer.");
		System.out.println(" ");

		int numeroDigitado = counter.nextInt();
		int valor = 1;

		while (valor <= numeroDigitado) {
			
			/* imprimir apenas numero par = 0 */
			/* imprimir apenas numero impar = 1 
			
			if(valor % 2 == 1 ) {
				
				System.out.println(valor);
				
			}*/
			
			System.out.println(valor);
			//valor += 1;
			//valor = valor + 1;
			//valor += valor;
			//++valor;
			valor ++;

		}

		counter.close();

	}

}
