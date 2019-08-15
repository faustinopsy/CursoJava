package br.senai.sp.informatica.fundamentos.respostas;

import javax.swing.JOptionPane;

public class Exercicio2a {
	public static void main(String[] args) {

		int nota1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a 1ª nota"));
		
		int nota2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a 2ª nota"));
		
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
		
		JOptionPane.showMessageDialog(null, 
				String.format("A sua média é: %.0f - %s", media, msg));
	}
}
