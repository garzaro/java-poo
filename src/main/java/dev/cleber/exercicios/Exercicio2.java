package dev.cleber.exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        /*calcular a raiz quadrada de um determinado numero*/

        int quadrado = 25;

        double resultadoDoQuadrado = Math.sqrt(quadrado);

        System.out.println(resultadoDoQuadrado);

        Scanner raizQuadrada = new Scanner(System.in);

        System.out.println("Digite um numero.");
        int raizQuadradaDe = raizQuadrada.nextInt();

        double resultadoQuadrado = Math.sqrt(raizQuadradaDe);

        System.out.println("A raiz quadrada de " + raizQuadradaDe + " é " + resultadoQuadrado);

        raizQuadrada.close();
    }
}
