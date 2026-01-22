package treinoControle;

import java.util.Scanner;

public class SomaPositivos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite vários números para saber a soma deles, ");
		System.out.print("ou digite um número negativo para sair: ");
		int num = entrada.nextInt();
		int escolha = 0;
		
		while(escolha >= 0) {
			System.out.print("\nDigite outro número: ");
			escolha = entrada.nextInt();
			System.out.println();
			if(escolha < 0) {
				break; // Sai do laço.
			}
			num += escolha;
			System.out.printf("A soma é igual a %d\n", num);
		}
		
		System.out.println("Fim!");
		
		entrada.close();
		
	}
	
}
