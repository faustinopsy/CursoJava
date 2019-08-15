package br.senai.sp.informatica.fundamentos.exemplos;

import javax.swing.JOptionPane;

public class CalculaValor {
	// ler Valor
	// e quantidade
	// apresentar o Total
	
	public static void main(String[] args) {
		String temp = JOptionPane.showInputDialog("Informe o Valor");
		double valor = Double.parseDouble(temp);
		
		temp = JOptionPane.showInputDialog("Informe a Quantidade");
		int quatidade = Integer.parseInt(temp);
		
		double total = valor * quatidade;
		
		JOptionPane.showMessageDialog(null, total);
	}
}
