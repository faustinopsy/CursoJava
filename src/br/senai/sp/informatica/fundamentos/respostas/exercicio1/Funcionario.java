package br.senai.sp.informatica.fundamentos.respostas.exercicio1;

import lombok.Data;

import static br.senai.sp.informatica.fundamentos.respostas.exercicio1.TabelaDeValores.*;

@Data
public class Funcionario {
	private double salHora;
	private int horas;
	private int dependentes;

	public double getSalBruto() {
		return horas * salHora + VALOR_POR_DEPENDENTE * dependentes;
	}
	
	public double getSalLiquido() {
		double salBruto = getSalBruto();
		return salBruto - calculaInss(salBruto) - calculaIr(salBruto);
	}
	
	@Override
	public String toString() {
		double salBruto = getSalBruto();
		
		return String.format(
				"Sal. Hora R$ %,.2f\n" +
				"Nº de Horas: %d\n" +
				"Nº de Dependentes: %d\n" +
				"Sal. Bruto R$ %,.2f\n" +
				"Valor do INSS R$ %,.2f\n" +
				"Valor do IR R$ %,.2f\n" +
				"Sal. Liq. R$ %,.2f"
				, salHora, horas, dependentes, 
				salBruto, calculaInss(salBruto), calculaIr(salBruto), getSalLiquido());
	}

}
