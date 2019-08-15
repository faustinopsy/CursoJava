package br.senai.sp.informatica.exe2;

import javax.swing.JOptionPane;

public class Mes {

	 public static void main(String[] args){
	       
	        int mes;
	      
	       String val1= JOptionPane.showInputDialog("Digite o mês em número");
	       mes = Integer.parseInt(val1);
	       
	    
	        switch(mes){
	            case 1:
	                JOptionPane.showMessageDialog( null, "Janeiro", 
	                        "Resultado", 
	                       JOptionPane.INFORMATION_MESSAGE );     
	                break;
	            case 2:
	                JOptionPane.showMessageDialog( null, "Fevereiro", 
	                        "Resultado", 
	                       JOptionPane.INFORMATION_MESSAGE );     
	                break;
	            case 3:
	                JOptionPane.showMessageDialog( null, "Março", 
	                        "Resultado", 
	                       JOptionPane.INFORMATION_MESSAGE );     
	                break;
	            case 4:
	                JOptionPane.showMessageDialog( null, "Abril", 
	                        "Resultado", 
	                       JOptionPane.INFORMATION_MESSAGE );     
	                break;
	            case 5:
	                JOptionPane.showMessageDialog( null, "Maio", 
	                        "Resultado", 
	                       JOptionPane.INFORMATION_MESSAGE );     
	                break;
	            case 6:
	                JOptionPane.showMessageDialog( null, "Junho", 
	                        "Resultado", 
	                       JOptionPane.INFORMATION_MESSAGE );     
	                break;
	            case 7:
	                JOptionPane.showMessageDialog( null, "Julho", 
	                        "Resultado", 
	                       JOptionPane.INFORMATION_MESSAGE );     
	                break;
	            case 8:
	                JOptionPane.showMessageDialog( null, "Agosto", 
	                        "Resultado", 
	                       JOptionPane.INFORMATION_MESSAGE );     
	                break;
	                case 9:
		                JOptionPane.showMessageDialog( null, "Setembro", 
		                        "Resultado", 
		                       JOptionPane.INFORMATION_MESSAGE );     
		                break;
		            case 10:
		                JOptionPane.showMessageDialog( null, "Outubro", 
		                        "Resultado", 
		                       JOptionPane.INFORMATION_MESSAGE );     
		                break;
		            case 11:
		                JOptionPane.showMessageDialog( null, "Novembro", 
		                        "Resultado", 
		                       JOptionPane.INFORMATION_MESSAGE );     
		                break;
		            case 12:
		                JOptionPane.showMessageDialog( null, "Dezembro", 
		                        "Resultado", 
		                       JOptionPane.INFORMATION_MESSAGE );     
		                break;
	            default:
	            	 JOptionPane.showMessageDialog( null, "Digite SOMENTE números entre 1 e 12", 
		                        "Resultado", 
		                       JOptionPane.INFORMATION_MESSAGE );     
	                
	                break;
	        }
	     
	    }
	
}
