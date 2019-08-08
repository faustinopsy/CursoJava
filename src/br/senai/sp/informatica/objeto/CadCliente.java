package br.senai.sp.informatica.objeto;

import javax.swing.JOptionPane;

public class CadCliente {

	public static void main(String[] args) {
		
		
		Cliente novo= new Cliente();
		String temp= JOptionPane.showInputDialog("informe o nome");
		novo.setNome(temp);
		String temp2= JOptionPane.showInputDialog("informe o email");
		novo.setEmail(temp2);
		String temp3= JOptionPane.showInputDialog("informe a Idade");
		novo.setIdade(Integer.parseInt(temp3));
		
		String imprimir =novo.getNome();
		imprimir+=novo.getEmail();
		imprimir+=novo.getIdade();
		
		System.out.println(imprimir);
	}
	
}
