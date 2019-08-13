package br.senai.sp.informatica.salario;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Media extends JFrame{

	static JFrame f;
    public static void main(String[] args) {
    	f = new JFrame("panel"); 
		JLabel SH,HT,DP,SB,DI,DR,S; 
		
		JPanel p = new JPanel(); 
    	
    	
    	String val1;
    	String val2;
    	
        double	media=0;
       
        val1= JOptionPane.showInputDialog("Informe as Horas Trabalhadas");
	
        val2= JOptionPane.showInputDialog("Informe o Salário por Hora");
	
        int x = Integer.parseInt(val1);
    	int y = Integer.parseInt(val2);
        media= x+y / 2;
        
     switch(media) {
     case media < 60;
     localizacao += "\nCamisas";

     break
     
     
     
     
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