package treinoControle;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a primeira nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.print("\nInsira a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println();
		
		System.out.printf("A média do aluno é igual a %.1f", media);
		
		if(media >= 7.0 && media <= 10.0) {
			System.out.println("\nAprovado!");
		} else if(media < 7.0 && media >= 4.0) {
			System.out.println("\nRecuperação...");
		} else if(media <= 3.9 && media >= 0.0){
			System.out.printf("\nReprovado.");
		} else {
			System.out.println("\nNota inválida!!");
		}
		
		entrada.close();
		
	}
	
}
