package br.senai.sp.informatica.fundamentos.exemplos;

import javax.swing.JOptionPane;

public class Codigos {
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
		switch (andar) {
		case "1":
			localizacao = "Calças";
			//break;
		case "2":
			localizacao += "\nBlusas";
			//break;
		case "3":
			localizacao += "\nSaias";
			//break;
		case "4":
			localizacao += "\nCamisas";
			break;
		case "5":
			localizacao = "Bolsas";
			break;
		default:
			localizacao = "Andar Inválido";
		}
		
		JOptionPane.showMessageDialog(null, localizacao);
	}
}
