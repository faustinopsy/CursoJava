package br.senai.sp.informatica.fundamentos.respostas.exercicio1;

import javax.swing.JOptionPane;

public class CalculaSalario {
	public static void main(String[] args) {
		Funcionario func1 = new Funcionario();
		
		String temp = JOptionPane.showInputDialog("Informe o Salário Hora");
		func1.setSalHora(Double.parseDouble(temp));

		temp = JOptionPane.showInputDialog("Informe o Nº de Horas");
		func1.setHoras(Integer.parseInt(temp));
		
		temp = JOptionPane.showInputDialog("Informe o Nº de Dependentes");
		func1.setDependentes(Integer.parseInt(temp));
		
		JOptionPane.showMessageDialog(null, func1);
	}
}
