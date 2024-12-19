package dev.cleber.exercicios;

import java.util.Scanner;

public class Exercicio6 {

	/*6. Escreva um programa que calcule o perímetro e a área de um retângulo.*/

	public static void main(String[] args) {
		double largura = 10;
		double altura = 20;
		double perimetro = 2 * (largura + altura);
		double area = largura * altura;

		System.out.println("O perimetro é " + perimetro + " e a area é " + area);

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a largura do retângulo: ");
		double largura1 = scanner.nextDouble();

		System.out.print("Digite a altura do retângulo: ");
		double altura1 = scanner.nextDouble();

		/*calcula o perímetro e a área do retangulo*/ 
		double perimetro1 = 2 * (largura + altura);
		double area1 = largura1 * altura1;
		
		System.out.println("Perímetro do retângulo: " + perimetro1);
		System.out.println("Área do retângulo: " + area1);

		scanner.close();

	}

}
