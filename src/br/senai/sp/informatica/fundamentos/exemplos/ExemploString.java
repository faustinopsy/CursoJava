package br.senai.sp.informatica.fundamentos.exemplos;

public class ExemploString {
	public static void main(String[] args) {
		String nome = "Sócrates";
		String adjetivo = new String("filósofo");
//		String nome = sujeito + " foi um grande ";		
		nome += " foi um grande ";
		nome += adjetivo;
		
		System.out.println(nome);
	}
}
