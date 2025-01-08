package dev.cleber.exercicios;

import java.util.Scanner;

public class Exercicio9 {
	
	/*
	 * 9. Escreva um programa que leia as medidas dos lados de um triângulo e escreva se
			ele é Equilátero, Isósceles ou Escaleno. Sendo que:
			
			a. Triângulo Equilátero: possui os 3 lados iguais.
			b. Triângulo Isósceles: possui 2 lados iguais.
			c. Triângulo Escaleno: possui 3 lados diferentes.

	 * */

	public static void main(String[] args) {

		double ladoUm = 10;
		double ladoDois = 20;
		double ladoTres = 30;

		if (ladoUm == ladoDois && ladoDois == ladoTres) {

			System.out.println("Triangulo equilátero.");

		} else if (ladoUm == ladoDois || ladoUm == ladoTres || ladoDois == ladoTres) {

			System.out.println("Triangulo isosceles.");

		} else {
			System.out.println("Triângulo escaleno");
		}

		/* scanner */

		Scanner triangulo = new Scanner(System.in);

		System.out.println("Digite o lado um 1.");
		double ladoUmDoTriangulo = triangulo.nextDouble();

		System.out.println("Digite o lado 2.");
		double ladoDoisDoTriangulo = triangulo.nextDouble();

		System.out.println("Digite o lado 3.");
		double ladoTresDoTriangulo = triangulo.nextDouble();
		

		if (
				
				ladoUmDoTriangulo == ladoDoisDoTriangulo 
				&& 
				ladoDoisDoTriangulo == ladoTresDoTriangulo)
			
		{

			System.out.println("Se os ângulos são todo iguais na medida trata-se de um triângulo equilátero.");

		} else if (
		
				   ladoUmDoTriangulo == ladoDoisDoTriangulo 
				|| ladoUmDoTriangulo == ladoTresDoTriangulo
				|| ladoDoisDoTriangulo == ladoTresDoTriangulo) 
		{

			System.out.println("Se dois dos ângulos são iguais na medida trata-se de um triângulo isósceles.");

		} else {
			
			System.out.println("Se os ângulos são todos diferentes na medida trata-se de um triângulo escaleno.");
			
		}
		triangulo.close();
	}
}
