package dev.cleber.loop;

import java.util.Scanner;

public class LoopFor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero ai, Jão?");

        int valor = scanner.nextInt();

        /*for ( inicializar; expressao; incremento )*/

        for (int contador = 0; contador <= valor; contador++) {

            System.out.println("O valor é: " + contador);

        }
        scanner.close();
    }

}
