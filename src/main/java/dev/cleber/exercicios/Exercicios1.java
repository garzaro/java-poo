package dev.cleber.exercicios;

import java.util.Scanner;

public class Exercicios1 {

    public static void main(String[] args) {

        /*1. Escreva um programa para declarar duas variáveis do tipo inteiro e calcular sua soma.
*/

        int numero1 = 10;
        int numero2 = 15;
        int soma = numero1 + numero2;

        System.out.println("A soma dos dois numerso é " + soma);

        Scanner digitaNumeros = new Scanner(System.in);

        System.out.println("Digite o primeiro número.");
        int numeroUm = digitaNumeros.nextInt();

        System.out.println("Digite o segundo número.");
        int numeroDois = digitaNumeros.nextInt();

        double somarOsDoisNumeros = numeroUm + numeroDois;
        System.out.println("A soma entre os dois numeros é " + somarOsDoisNumeros);

        digitaNumeros.close();
    }

}
