package br.senai.sp.informatica.exe2;


import java.util.Arrays;
import java.util.Collections;


import javax.swing.JOptionPane;

public class Ordenar {

	

    public static void main( String args[] ) {
    	Integer vet[] = new Integer[5];
    	
    	String val="";
    	String val2="";
    	String o="";
    	String d="";
    	
	for(int i=0; i < vet.length; i++)//verifica o tamnho do array
	{
		val= JOptionPane.showInputDialog("Digite o Número ");
		vet[i] =Integer.parseInt(val);
		val2+=val+"-";
	}
	Arrays.sort(vet);//ordena os numeros
    
    for(int i=0; i<vet.length; i++) //percorre o vetor e concatena a string o ordenando-os
    {
        o+=vet[i]+"-";
        
    }
    Arrays.sort(vet, Collections.reverseOrder());//inverte a ordem dos numeros
    for(int i=0; i<vet.length; i++) //percorre o vetor e concatena a string d com os numeros inversos
    {
        d+=vet[i]+"-";
        
    } 
	    JOptionPane.showMessageDialog( null," Digitados : "+ val2 +"\n Ordenado : "+o  
	    		+"\n Decrescente : "+d,
	    "Resultado", 
		        JOptionPane.INFORMATION_MESSAGE ); 
		 
}
   
}
