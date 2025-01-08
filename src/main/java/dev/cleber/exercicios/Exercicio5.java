package dev.cleber.exercicios;

import java.util.Scanner;

public class Exercicio5 {
	
	/*5. Escreva um programa Java que converta graus Celsius para Fahrenheit.*/

	public static void main(String[] args) {

		double grauCelsius = 25;

		double fahrenheit1 = (grauCelsius * 1.8) + 32;
		/* ou */
		double fahrenheit2 = (grauCelsius * 9 / 5) + 32;

		System.out.println(fahrenheit1 + "ºF");
		System.out.println(fahrenheit2 + "ºF");

		/* snanner */

		Scanner graus = new Scanner(System.in);
		System.out.println("Digite uma temperatura em graus celsius.");
		double celsius = graus.nextDouble();
		double grauConvertido = (celsius * 9 / 5) + 32; /* 9/5 = 1.8 */

		/* Fahrenheit para Celsius */
		int fahrenheit = 77;
		double toCelsius = (fahrenheit - 32) / 1.8;

		System.out.println(
				celsius + " graus celsius convertido e fahrenheit é " + grauConvertido + "°F - (" + toCelsius + ")");

		graus.close();

	}

}

/*
 * Diferenças entre Celsius e Fahrenheit: Ponto de congelamento da água: Em
 * Celsius, a água congela a 0°C, enquanto em Fahrenheit, a 32°F. Ponto de
 * ebulição da água: Em Celsius, a água ferve a 100°C, enquanto em Fahrenheit, a
 * 212°F. Divisão dos graus: A diferença entre o ponto de congelamento e o ponto
 * de ebulição da água é dividida em 100 partes iguais na escala Celsius e em
 * 180 partes iguais na escala Fahrenheit. Isso significa que 1 grau Celsius
 * equivale a 1,8 graus Fahrenheit.
 * 
 * ************************************************************************
 * 
 * Fórmula de conversão de Celsius para Fahrenheit
 * 
 * Fahrenheit = (Celsius * 1.8) + 32
 * 
 * 
 * Fórmula de conversão de Fahrenheit para Celsius Celsius = (Fahrenheit - 32) /
 * 1.8
 * 
 * ************************************************************************
 * 
 * Cálculo de Celsius para Fahrenheit Fahrenheit
 * 
 * (Celsius * 1.8) + 32
 * 
 * Fahrenheit = (25 * 1.8) + 32
 * 
 * Fahrenheit = 45 + 32
 * 
 * Fahrenheit = 77
 * 
 */
