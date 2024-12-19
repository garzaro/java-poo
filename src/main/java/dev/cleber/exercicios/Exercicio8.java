package dev.cleber.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio8 {

	/*
	 * 8. Dado que existe um mercado onde as maçãs custam R$ 0,30 cada se forem
	 * compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos
	 * doze. Escreva um programa que leia o número de maçãs compradas, calcule e
	 * escreva o valor total da compra.
	 */

	public static void main(String[] args) {

		String fruta = "laranja";

		double precoReal = 0.30;

		double precoComDesconto = 0.25;

		int quantidade = 11;

		double desconto = precoReal - precoComDesconto;

		if (quantidade >= 12) {
			DecimalFormat df = new DecimalFormat("0.00");
			System.out.println("Voce está levando " + quantidade + " " + fruta + " , desconto de " + df.format(desconto)
					+ " centavos, pagará apenas " + precoComDesconto + " cada.");

		} else {
			DecimalFormat df1 = new DecimalFormat("0.00");
			System.out.println("Voce está levando menos de " + quantidade + " maçãs, não tem desconto de "
					+ df1.format(desconto) + " centavos.");

		}

		/* scanner */

		Scanner feira = new Scanner(System.in);

		System.out.println("Quantas " + fruta + "s vai levar?");

		int quantidadeDeFrutas = feira.nextInt();

		double valorDaCompraComDesconto = quantidadeDeFrutas * precoComDesconto;

		double economizr = desconto * 12;

		double valorDaCompraSemDesconto = quantidadeDeFrutas * precoReal;

		if (quantidadeDeFrutas >= 12) {

			DecimalFormat df = new DecimalFormat("0.00");

			System.out.println("Está levando " + quantidadeDeFrutas + " " + fruta + ", teve desconto de R$ "
					+ df.format(desconto) + " reais cada, economizando R$ " + df.format(economizr)
					+ " reais. Valor da compra R$ " + df.format(valorDaCompraComDesconto) + " reais.");

		} else {

			DecimalFormat df = new DecimalFormat("0.00");

			System.out.println("Está levando menos de 12 " + fruta + ", não obteve desconto de R$ " + df.format(desconto)
					+ " reais cada " + fruta + " deixando de economizar R$ " + df.format(economizr)
					+ " reais. Valor da compra R$ " + df.format(valorDaCompraSemDesconto) + " reais.");

		}

		feira.close();
	}

}
