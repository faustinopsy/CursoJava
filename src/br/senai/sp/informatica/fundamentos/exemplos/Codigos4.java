package br.senai.sp.informatica.fundamentos.exemplos;

import javax.swing.JOptionPane;

public class Codigos4 {
	/*  Departamentos de uma Loja
	 * 1 - Calças
	 * 2 - Blusas
	 * 3 - Saias
	 * 4 - Camisas
	 * 5 - Bolsas
	 */
	
	public static void main(String[] args) {
		String temp = JOptionPane.showInputDialog("Informe o Andar");
		int andar = Integer.parseInt(temp);
		
		String localizacao = "";
		if(andar >= 1 && andar <= 4) {
			localizacao += "\nCamisas";
		} else if(andar == 5) {
			localizacao = "Bolsas";
		} else {
			localizacao = "Andar Inválido";
		}
		
		JOptionPane.showMessageDialog(null, localizacao);
	}
}
