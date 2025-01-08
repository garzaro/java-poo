package dev.cleber.exercicios;

import java.util.Scanner;

public class Exercicio10 {
	
	/*10. Tendo como entrada a altura e o sexo (codificado da seguinte forma:
			digitando 1:feminino e digitando 2:masculino) de uma pessoa, construa um
			programa que
			calcule e imprima seu peso ideal, utilizando as seguintes Fórmulas:
			
			- para homens: (72.7 * Altura) – 58
			- para mulheres: (62.1 * Altura) – 44.7
*/
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua altura (em metros)");
		double altura = scanner.nextDouble();
		
		System.out.println("Digite o sexo (1 - Feminino | 2 - Masculino)");
		double sexo = scanner.nextDouble();
		
		double pesoIdeal;
		
		if (sexo == 1) {
			pesoIdeal = (62.1 * altura) - 44.7;			
		} else {

		}
		
	}
	

}
