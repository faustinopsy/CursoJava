package br.senai.sp.informatica.fundamentos.respostas;

import javax.swing.JOptionPane;

public class Exercicio1a {
	public static void main(String[] args) {
		String temp = JOptionPane.showInputDialog("Informe o Salário Hora");
		double salHora = Double.parseDouble(temp);
		String msg = String.format("Sal. Hora R$ %,.2f\n", salHora);
		
		temp = JOptionPane.showInputDialog("Informe o Nº de Horas");
		int numHora = Integer.parseInt(temp);
		msg += "Nº de Horas: " + numHora + "\n";
		
		temp = JOptionPane.showInputDialog("Informe o Nº de Dependentes");
		int dep = Integer.parseInt(temp);
		msg += "Nº de Dependentes: " + dep + "\n";
		
		double salBruto = numHora * salHora + 50 * dep;
		msg += String.format("Sal. Bruto R$ %,.2f\n", salBruto);
		
		double inss;
		if(salBruto <= 1000) {
			inss = salBruto * 0.085;
		} else { 
			inss = salBruto * 0.09;
		}
		msg += String.format("Valor do INSS R$ %,.2f\n", inss);

		double ir;		
		if(salBruto <= 500) {
			ir = 0;
		} else if(salBruto <= 1000) {
			ir = salBruto * 0.05;
		} else {
			ir = salBruto * 0.07;
		}
		msg += String.format("Valor do IR R$ %,.2f\n", ir);
		
		double salLiq = salBruto - inss - ir;
		msg += String.format("Sal. Liq. R$ %,.2f", salLiq);
		
		JOptionPane.showMessageDialog(null, msg);
	}
}
