package treinoControle;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro para saber"
				+ " se é par ou ímpar, e se está entre 0 e 10: ");
		int num = entrada.nextInt();
		
		boolean par = num % 2 == 0; // Resto de divisão por 2 é 0, par.
		
		boolean impar = num % 2 == 1; // Resto de divisão por 2 é 1, ímpar.
		
		boolean entreZeroDez = num > 0 && num < 10;
		
		if(par && entreZeroDez) {
			System.out.printf("\nO número %d está entre 0 e 10 e é par!", num);
		} else if(impar && entreZeroDez) {
			System.out.printf("\nO número %d está entre 0 e 10 e é ímpar!", num);
		} else if(par) {
			System.out.printf("\nO número %d não está entre 0 e 10 e é par!", num);
		} else {
			System.out.printf("\nO número %d não está entre 0 e 10 e é ímpar!", num);
		}
		
		entrada.close();
		
	}
	
}
