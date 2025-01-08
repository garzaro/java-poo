package dev.cleber.aluno;

import java.util.Scanner;

public class Boletim {

	public static void main(String[] args) {

		double primeiroTrimestre, segundoTrimestre, terceiroTrimestre, media;

		primeiroTrimestre = 9.5;
		segundoTrimestre = 8.5;
		terceiroTrimestre = 9.0;
		media = (primeiroTrimestre + segundoTrimestre + terceiroTrimestre) / 3;

		System.out.println("A media é " + media);

		Scanner boletim = new Scanner(System.in);

		System.out.println("Digite a nota do primeiro trimestre.");
		double notaPrimeiroTrimestre = boletim.nextDouble();

		System.out.println("Digite a nota do primeiro trimestre.");
		double notaSegundoTrimestre = boletim.nextDouble();

		System.out.println("Digite a nota do primeiro trimestre.");
		double notaTerceiroTrimestre = boletim.nextDouble();

		double mediaGeral = (notaPrimeiroTrimestre + notaSegundoTrimestre + notaTerceiroTrimestre) / 3;

		double mediaArredondada = Math.ceil(mediaGeral);

		System.out.println("A media do aluno é " + mediaGeral + " - arredondamento - " + mediaArredondada);

		if (mediaGeral >= 9) {
			System.out.println("Parabens, aprovado com excelencia.");

		} else if (mediaGeral >= 7 && mediaGeral <= 8.9) {
			System.out.println("Aprovado, parabéns.");

		}
		if (mediaGeral <= 5.9) {
			System.out.println("Reprovado, mantenha o foco e continue tentando.");
		}

		boletim.close();
	}

}
