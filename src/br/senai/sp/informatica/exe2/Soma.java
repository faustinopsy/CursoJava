package br.senai.sp.informatica.exe2;

import javax.swing.JOptionPane;

public class Soma {

    public static void main( String args[] ) {
        
        String tela  = " ";
        int x,
            i = 1;
    
        for ( x = 1; x <= 15; x += 2 ) {
           i = x * i;

           tela = tela + " X " + x;
                        
        }   
       
        tela = "Os números são: " + tela + 
                   "\nO Resultado é: " + i; 
       

        JOptionPane.showMessageDialog( null, tela, 
         "Resultado", 
        JOptionPane.INFORMATION_MESSAGE );     
        
 

  } 
}