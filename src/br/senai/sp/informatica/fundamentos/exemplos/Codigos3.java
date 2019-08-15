package br.senai.sp.informatica.fundamentos.exemplos;

import javax.swing.JOptionPane;

public class Codigos3 {
	/*  Departamentos de uma Loja
	 * 1 - Calças
	 * 2 - Blusas
	 * 3 - Saias
	 * 4 - Camisas
	 * 5 - Bolsas
	 */
	
	public static void main(String[] args) {
		String andar = JOptionPane.showInputDialog("Informe o Andar");
		
		String localizacao = "";
		if(andar.equals("1") || andar.equals("2") || andar.equals("3") || andar.equals("4")) {
			localizacao += "\nCamisas";
		} else if(andar.equals("5")) {
			localizacao = "Bolsas";
		} else {
			localizacao = "Andar Inválido";
		}
		
		JOptionPane.showMessageDialog(null, localizacao);
	}
}
