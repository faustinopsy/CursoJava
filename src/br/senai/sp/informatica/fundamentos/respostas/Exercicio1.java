package br.senai.sp.informatica.fundamentos.respostas;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		String temp = JOptionPane.showInputDialog("Informe o Salário Hora");
		double salHora = Double.parseDouble(temp);
		
		temp = JOptionPane.showInputDialog("Informe o Nº de Horas");
		int numHora = Integer.parseInt(temp);
		
		temp = JOptionPane.showInputDialog("Informe o Nº de Dependentes");
		int dep = Integer.parseInt(temp);

		double salBruto = numHora * salHora + 50 * dep;
		
		double inss;
		inss = salBruto <= 1000 ? salBruto * 0.085 : salBruto * 0.09;
		
//		if(salBruto <= 1000) inss = salBruto * 0.085;
//		else inss = salBruto * 0.09;
//
//		if(salBruto <= 1000) 
//			inss = salBruto * 0.085;
//		else 
//			inss = salBruto * 0.09;
//
//		if(salBruto <= 1000) {
//			inss = salBruto * 0.085;
//		} else { 
//			inss = salBruto * 0.09;
//		}

		double ir;
				
		if(salBruto <= 500) {
			ir = 0;
		} else if(salBruto <= 1000) {
			ir = salBruto * 0.05;
		} else {
			ir = salBruto * 0.07;
		}
		
		double salLiq = salBruto - inss - ir;
		
		JOptionPane.showMessageDialog(null, String.format(
				"Sal. Hora R$ %,.2f\n" +
				"Nº de Horas: %d\n" +
				"Nº de Dependentes: %d\n" +
				"Sal. Bruto R$ %,.2f\n" +
				"Valor do INSS R$ %,.2f\n" +
				"Valor do IR R$ %,.2f\n" +
				"Sal. Liq. R$ %,.2f"
				, salHora, numHora, dep, salBruto, inss, ir, salLiq));
	}
}
