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
    	String mensagem="";
        double	media=0;
       
        val1= JOptionPane.showInputDialog("Informe 1º número de 0 a 100");
	
        val2= JOptionPane.showInputDialog("Informe 2º número de 0 a 100");
	
        int x = Integer.parseInt(val1);
    	int y = Integer.parseInt(val2);
        media= (x+y) / 2;
        
        
        if(media<=60 ) {
        	mensagem="Insuficiente";
    	}else if(media >=61 && media<=80)
    	{
    		mensagem="Satisfatoria";
    	}
    	
    	else
    	if(media >=81 && media<=90) {
    		mensagem="boa";
    	}
    	else
        	if(media >90) {
        		mensagem="Excelente";
        	}
//alterar  logo apos finalizar o switch	
	
	String imprimir1 =mensagem ;
	String imprimir2="\n a media foi "+media;
	
	SH=new JLabel(imprimir1);
	HT=new JLabel(imprimir2);
	
	
	p.add(SH);
	p.add(HT);
	
	
	f.add(p); 
	f.setBounds(450, 350, 250, 250);
	//f.setSize(200, 300); 
  
    f.show();
    
    
    }
}
