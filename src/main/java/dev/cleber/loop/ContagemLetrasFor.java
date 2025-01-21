package dev.cleber.loop;

import java.util.Scanner;

/*conta apenas a letras, exclui da contagem numero e espaço em branco*/

public class ContagemLetrasFor {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma frase.");
		System.out.println("");

		String frase = scan.nextLine();
		int quantidadeDeLetras = 0;

		for (int indice = 0; indice < frase.length(); indice++) {

			char letra = frase.charAt(indice);

			/* é letras? */

			boolean isLetra = Character.isLetter(letra);

			/* condição -> é letra, então incrementa? */

			if (isLetra) {
				quantidadeDeLetras++;

			} else {

			}
		}
		System.out.println("");

		System.out.println("A quantidade de letras é: " + quantidadeDeLetras);

		scan.close();

	}

}
