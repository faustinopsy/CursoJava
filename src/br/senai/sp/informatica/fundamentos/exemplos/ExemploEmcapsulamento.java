package br.senai.sp.informatica.fundamentos.exemplos;

import br.senai.sp.informatica.fundamentos.exemplos.teste.Filho;
import br.senai.sp.informatica.fundamentos.exemplos.teste.Pai;

public class ExemploEmcapsulamento {
	public static void main(String[] args) {
		//int[] numeros = new int[5];
		
		Pai[] cadastro = new Pai[7];
		
		
		cadastro[0] = new Pai();
		cadastro[0].setNome("José");
	
		Pai x2 = new Pai("Antonio");
		cadastro[1] = x2;
		
		Filho y = new Filho();
		y.setNome("João");
		y.setIdade(35);
		cadastro[2] = y;
		
		cadastro[3] = new Filho("Josefina", 32);
		
		cadastro[4] = Filho.builder()
				.idade(44)
				.nome("Joca")
				.build();
				
		cadastro[5] = Filho.builder()
				.nome("Joana")
				.idade(22)
				.build();
		
		cadastro[6] = Filho.builder().nome("Zé").build();
		
		
		for (Pai pessoa : cadastro) {
			System.out.println(pessoa);
		}
	}
}
