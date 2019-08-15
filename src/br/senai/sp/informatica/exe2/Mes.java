package br.senai.sp.informatica.exe2;

import javax.swing.JOptionPane;

public class Mes {

	 public static void main(String[] args){
	       
	        int mes;
	        int x=1;
	        String mostra="";
	       
	       
	    while(x==1) {
	    	String val1= JOptionPane.showInputDialog("Digite o mês em número");
		       mes = Integer.parseInt(val1);
	        switch(mes){
	            case 1:
	                mostra= "Janeiro";   
	                x=2;
	                break;
	            case 2:
	            	 mostra= "Fevereiro"; 
	                x=2;
	                break;
	            case 3:
	            	 mostra=  "Março"; 
	                x=2;
	                break;
	            case 4:
	            	 mostra= "Abril";    
	                x=2;
	                break;
	            case 5:
	            	 mostra= "Maio";     
	                x=2;
	                break;
	            case 6:
	            	 mostra= "Junho";  
	                x=2;
	                break;
	            case 7:
	            	 mostra=  "Julho";
	                x=2; 
	                break;
	            case 8:
	            	 mostra= "Agosto"; 
	                x=2;
	                break;
	                case 9:
	                	 mostra=  "Setembro"; 
		                x=2;
		                break;
		            case 10:
		            	 mostra= "Outubro";
		                x=2;
		                break;
		            case 11:
		            	 mostra= "Novembro";   
		                x=2;
		                break;
		            case 12:
		            	 mostra=  "Dezembro";
		                x=2;
		                break;
	            default:
	            	 JOptionPane.showMessageDialog( null, "Digite SOMENTE números entre 1 e 12", 
		                        "Resultado", 
		                       JOptionPane.INFORMATION_MESSAGE );     
	                
	                break;
	        }
	    }
	    JOptionPane.showMessageDialog( null, mostra , 
                "Resultado", 
               JOptionPane.INFORMATION_MESSAGE ); 
	    }
	
}
