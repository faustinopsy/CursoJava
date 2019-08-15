package br.senai.sp.informatica.fundamentos.respostas.exercicio1;

public class TabelaDeValores {
	public static final int VALOR_POR_DEPENDENTE = 50;
	
	public static double calculaInss(double salBruto) {
		double inss;
		
		if(salBruto <= 1000) {
			inss = salBruto * 0.085;
		} else { 
			inss = salBruto * 0.09;
		}
		
		return inss;
	}
	
	public static double calculaIr(double salBruto) {
		double ir;		
		
		if(salBruto <= 500) {
			ir = 0;
		} else if(salBruto <= 1000) {
			ir = salBruto * 0.05;
		} else {
			ir = salBruto * 0.07;
		}
		
		return ir;
	}
	
}
