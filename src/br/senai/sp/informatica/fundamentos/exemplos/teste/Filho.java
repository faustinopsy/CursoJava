package br.senai.sp.informatica.fundamentos.exemplos.teste;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Filho extends Pai {
	private int idade;

	public Filho(int idade) {
		super("");
		this.idade = idade;
	}
	
	public Filho(String nome) {
		super(nome);
		this.idade = 0;
	}

	public Filho(String nome, int idade) {
		super(nome);
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return super.toString() + " idade: " + idade;
	}

	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder {
		private Filho filho = new Filho();
				
		public Builder nome(String nome) {
			filho.setNome(nome);
			return this;
		}
		
		public Builder idade(int idade) {
			filho.setIdade(idade);
			return this;
		}
		
		public Filho build() {
			return filho;
		}
	}

}
