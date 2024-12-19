package dev.cleber.exercicios;

public class Exercicio7 {
	
	public static void main(String[] args) {
		
		int anoAtual = 2024;
		int anoNascimento = 1974;
		int podeVotar = anoAtual-anoNascimento;
		
		if (podeVotar < 18) {
			System.out.println("Voce é menor ainda e esse ano voce nao poderá votar");
			
		}else {
			System.out.println("Voce poderá vota esse ano.");
		}
		
	}

}
