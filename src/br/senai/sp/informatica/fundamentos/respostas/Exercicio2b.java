package br.senai.sp.informatica.fundamentos.respostas;

import static br.senai.sp.informatica.lib.InputUtil.*;

public class Exercicio2b {
	public static void main(String[] args) {

		int nota1 = leInteiro("Informe a 1ª nota");
		
		int nota2 = leInteiro("Informe a 2ª nota");
		
		double media = (nota1 + nota2) / 2;
		
		String msg;
		if(media <= 60) {
			msg = "Insuficiente";
		} else if(media <= 80) {
			msg = "Satisfatória";
		} else if(media <= 90) {
			msg = "Boa";
		} else {
			msg = "Excelente";
		}
		
		escreva("A sua média é: ", (int)media, " - ", msg);
	}
}
