package treinoControle;

import java.util.Scanner;

public class NumPrimoSwitch {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = entrada.nextInt();
		
		boolean primo = num > 1;
		
		for (int i = 2; i < num; i++) {
			if(num % i == 0) {
				primo = false;
				break;
			}
		}
		
		switch(primo ? 1 : 0) {
		case 1:
			System.out.printf("\nO número %d é primo!", num);
			break;
		case 0:
			System.out.printf("\nO número %d não é primo.", num);
		}
		
		entrada.close();
		
	}
	
}
