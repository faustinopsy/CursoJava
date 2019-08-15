package br.senai.sp.informatica.fundamentos.exemplos;

import javax.swing.JOptionPane;

public class TabelaDeIr {
	/*
	 *                até  2000  5%
	 * acima de  2000 até 10000 15%
	 * acima de 10000 até 20000 20%
	 *           acima de 20000 25%
	 */
	public static void main(String[] args) {	
		String aux = JOptionPane.showInputDialog("Informe o Salário");
		double salario = Double.parseDouble(aux);
		double ir;
		
		if(salario <= 2000) {
			ir = salario * 0.05;
		} else if(salario <= 10000) {
			ir = salario * 15 / 100;
		} else if(salario <= 20000) {
			ir = salario * 0.2;
		} else {
			ir = salario * .25;
		}
		
		JOptionPane.showMessageDialog(null, 
				String.format("O Desconto de IR será de: R$ %,.2f", ir));
	}
}
