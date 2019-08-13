package br.senai.sp.informatica.salario;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Spring;

public class Calcula extends JFrame{

	static JFrame f;
    public static void main(String[] args) {
    	f = new JFrame("panel"); 
		JLabel SH,HT,DP,SB,DI,DR,S; 
		
		JPanel p = new JPanel(); 
    	
    	
    	String SalHora;
    	String HoraTrab;
    	String Depe;
    	int SalBrut;
        double	DescInss=0;
        int DescIr=0;
        double sal=0;
    HoraTrab= JOptionPane.showInputDialog("Informe as Horas Trabalhadas");
	
	SalHora= JOptionPane.showInputDialog("Informe o Salário por Hora");
	
	Depe= JOptionPane.showInputDialog("informe o Número de dependentes");
	
	int x = Integer.parseInt(HoraTrab);
	int y = Integer.parseInt(SalHora);
	int z = Integer.parseInt(Depe);
	
	SalBrut = (x * y)+ z;
	
	if(SalBrut<=1000) {
		DescInss= SalBrut * 8.5 / 100;
		DescIr= SalBrut * 5/ 100;
		sal=SalBrut-DescInss-DescIr;
	}else if(SalBrut >1000)
	{
		DescInss= SalBrut * 9 / 100;
		DescIr= SalBrut * 7/ 100;
		sal=SalBrut-DescInss-DescIr;
	}
	
	else
	if(SalBrut<=500) {
		DescIr= 0;
		DescInss= SalBrut * 8.5 / 100;
		sal=SalBrut-DescInss-DescIr;
	}
	
	
	
	
	String imprimir1 ="\n Horas Trabalhadas: "+x;
	String imprimir2="\n Salário por Hora: "+SalHora;
	String imprimir3="\n Dependentes: "+Depe;
	String imprimir4="\n Salário bruto: "+SalBrut;
	String imprimir5="\n Desconto INSS: "+DescInss;
	String imprimir6="\n Desconto IR: "+DescIr;
	String imprimir7="\n Salario Liquido: "+sal;
	
	
	SH=new JLabel(imprimir1);
	HT=new JLabel(imprimir2);
	DP=new JLabel(imprimir3);
	SB=new JLabel(imprimir4);
	DI=new JLabel(imprimir5);
	DR=new JLabel(imprimir6);
	S=new JLabel(imprimir7);
	
	
	p.add(SH);
	p.add(HT);
	p.add(DP);
	p.add(SB);
	p.add(SB);
	p.add(DR);
	p.add(S);
	
	f.add(p); 
	f.setSize(300, 300); 
  
    f.show();
    
    
    }
}
