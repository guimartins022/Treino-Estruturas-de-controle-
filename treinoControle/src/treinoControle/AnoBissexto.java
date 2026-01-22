package treinoControle;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AnoBissexto {

	public static void main(String[] args) {
		
		Date dataAtual = new Date();
		SimpleDateFormat ano = new SimpleDateFormat("yyyy");
		
		String anoAtual = ano.format(dataAtual);
		int numAnoAtual = Integer.parseInt(anoAtual); // transforma o ano (string) em inteiro.
		
		System.out.printf("Ano atual: %d\n", numAnoAtual); // formata a string para a variável.
		
		boolean bissexto = numAnoAtual % 400 == 0 || numAnoAtual % 4 == 0 && numAnoAtual % 100 != 0;
		
		if(bissexto) {
			System.out.printf("O ano %d é um ano bissexto!", numAnoAtual);
		} else {
			System.out.printf("O ano %d não é um ano bissexto!", numAnoAtual);
		}
		
	}
	
}
