package br.senai.sp.informatica.exe2;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ordenar {

	

    public static void main( String args[] ) {
    	int vet[] = new int[5];
    	String val="";
    	String val2="";
    	String xx="";
    	
	for(int i=0; i < vet.length; i++)
	{
		val= JOptionPane.showInputDialog("Digite o Número ");
		vet[i] =Integer.parseInt(val);
		val2+=val+"-";
	}
	Arrays.sort(vet);
    
    for(int i=0; i<vet.length; i++){
        xx+=vet[i]+"-";
    }
       
	 JOptionPane.showMessageDialog( null," Na ordem: "+ xx +"\n Fora da ordem: "+val2, 
	         "Resultado", 
	        JOptionPane.INFORMATION_MESSAGE );  
}
}
