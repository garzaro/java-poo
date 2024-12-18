package dev.cleber.exercicios;

import java.util.Scanner;

public class Exercicio2_1 {
	
	public static void main(String[] args) {
		
		/*calcular a elevação de numeros ao quadrado*/
		
		int expoente = 5;
	    
		int numeroElevadoAoQuadrado = 2;

	    double resultado = Math.pow(numeroElevadoAoQuadrado, expoente);
	    
	    System.out.println("O resultado da elevação é " + resultado);
	    
	    /*scanner*/

	    Scanner exponenciacao = new Scanner(System.in);

	    System.out.println("Digite um numero.");
	    int numeroElevado = exponenciacao.nextInt();

	    double resultadoElevado = Math.pow(numeroElevado, expoente);

	    System.out.println("O resultado da elevação é " + resultadoElevado);

	    exponenciacao.close();
		
	}	
}


