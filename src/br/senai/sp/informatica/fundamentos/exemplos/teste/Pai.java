package br.senai.sp.informatica.fundamentos.exemplos.teste;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pai {
	private String nome;

//	public Pai() {
//		super();
//	}

//	public Pai(String nome) {
//		super();
//		this.nome = nome;
//	}

//	public String getNome() {
//		return texto;
//	}
//
//	public void setNome(String nome) {
//		this.nome = nome;
//	}

	@Override
	public String toString() {
		return "nome: " + nome;
	}
}
