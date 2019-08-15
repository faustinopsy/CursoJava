package br.senai.sp.informatica.fundamentos.exemplos;

import br.senai.sp.informatica.fundamentos.exemplos.teste.Filho;

public class ExemploUsoBuilder {
	public static void main(String[] args) {
		Filho[] lista = {
			Filho.builder().nome("Jonas").idade(41).build(),
			Filho.builder().nome("Antonio").build()
		};
	
		
		for (Filho filho : lista) {
			System.out.println(filho);
		}
	}
}
