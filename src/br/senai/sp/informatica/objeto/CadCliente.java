package br.senai.sp.informatica.objeto;

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class CadCliente extends JFrame{

	static JFrame f;
	
	public static void main(String[] args) {
		
		f = new JFrame("panel"); 
		JLabel l; 
		l = new JLabel(""); 
		JPanel p = new JPanel(); 
		
		Cliente novo= new Cliente();
		String temp= JOptionPane.showInputDialog("informe o nome");
		novo.setNome(temp);
		String temp2= JOptionPane.showInputDialog("informe o email");
		novo.setEmail(temp2);
		String temp3= JOptionPane.showInputDialog("informe a Idade");
		novo.setIdade(Integer.parseInt(temp3));
		
		String imprimir ="Nome: \r\n"+novo.getNome();
		imprimir+=" Email: \r\n"+novo.getEmail();
		imprimir+=" Idade: \r\n"+novo.getIdade();
		
		l = new JLabel(imprimir); 
		p.add(l);
		f.add(p); 
		f.setSize(300, 300); 
	  
	        f.show();
	}
	
	
}
