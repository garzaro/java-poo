package dev.cleber.loop;

import java.util.Scanner;

public class MenuDoWhile {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int item = 0;

		do {
			
			System.out.println("Digite uma opção.");
			
			System.out.println(" ");
			
			System.out.println("1 - cachaça");
			
			System.out.println("2 - cunhaque presidente");
			
			System.out.println("3 - vinho Sao Braz");
			
			System.out.println("0 - sair");
			
			item = scan.nextInt();
			
			if (item == 0) {
				
				System.out.println("Saindo do sistema...");
				
			} else if(item == 1){
				
				System.out.println("Retire sua dose de cachaça.");

			}else if(item == 2) {
				
				System.out.println("Retire sua dose de cunhaque presidente.");
				
			}else {
				
				System.out.println("Retire sua dose de vinho Sao Braz.");
				
			}
			
		} while (item != 0);
		
		scan.close();

	}

}
