package br.senai.sp.informatica.exe2;

import javax.swing.JOptionPane;

public class Soma {

    public static void main( String args[] ) {
        
        String tela  = " ";//cria a string de respota na tela
        int x,i = 1;//cria variaveis inteiras insere valor a i
    
        for ( x = 1; x <= 15; x += 2 )//loop para multiplicar os números concatenando +2 para multiplicar só números impares
        {
           i = x * i; //1x1 3x3 5x5 7x7

           tela = tela + " X " + x; //mostrar x1 x 3 x 5 x7
                        
        }   
       
        tela = "Os números são: " + tela + 
                   "\nO Resultado é: " + i; 
       

        JOptionPane.showMessageDialog( null, tela, 
         "Resultado", 
        JOptionPane.INFORMATION_MESSAGE );     
        
 

  } 
}