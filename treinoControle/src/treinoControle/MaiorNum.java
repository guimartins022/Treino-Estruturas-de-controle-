package treinoControle;

import java.util.Scanner;

public class MaiorNum {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite diferentes números 10 vezes para saber qual deles é o maior.\n");
		System.out.print("Digite o 1° número: ");
		int maior = entrada.nextInt(); // por enquanto, o primeiro número é o maior...
		
		for (int i = 2; i <= 10; i++) {
			System.out.print("\nDigite o " + i + "° número: ");
			int num = entrada.nextInt();
			if(num > maior) {
				maior = num;
			}
		}
		
		System.out.printf("\nO maior número é o %d!", maior);
		
		entrada.close();
		
	}
	
}
