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
       
        val1= JOptionPane.showInputDialog("Informe 1º número de 0 a 100");
	
        val2= JOptionPane.showInputDialog("Informe 2º número de 0 a 100");
	
        
        int x = Integer.parseInt(val1);
    	int y = Integer.parseInt(val2);
    	
    	 media= (x+y) / 2;
        JOptionPane.showMessageDialog( null, media, 
                "Resultado", 
               JOptionPane.INFORMATION_MESSAGE );  
    }
}
