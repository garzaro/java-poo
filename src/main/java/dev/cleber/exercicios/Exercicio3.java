package dev.cleber.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        /*3. Escreva um programa Java que calcule a média de três números inteiros.*/

        int numero1, numero2, numero3;
        numero1 = 10;
        numero2 = 20;
        numero3 = 30;
        double media = (numero1 + numero2 + numero3)/3;

        System.out.println("A média entre esses três números é " + media);

        /*******************************************/

        Scanner calcularMedia = new Scanner(System.in);

        System.out.println("Digite o primeiro número.");
        double num1 = calcularMedia.nextDouble();

        System.out.println("Digite o segundo número.");
        double num2 = calcularMedia.nextDouble();
        
        System.out.println("Digite o terceiro número.");
        double num3 = calcularMedia.nextDouble();
        
        double mediaDosNumeros = (num1+ num2+ num3)/3;
        
        System.out.println("A média entre esses três números é " + mediaDosNumeros);
        
        calcularMedia.close();
        

    }
}
