package br.senai.sp.informatica.fundamentos.exemplos;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ExemploVetor {
	public static void main(String[] args) {
		// posição ->       0  1  2
		int[] lista = { 1, 2, 3 };
		
		// Crie um contador (i) para utilizar como 
		// indexador da lista 
		for (int i = 0; i < lista.length; i++) {
			// Imprima cada item da lista 
			// usando a variável (i) como indice
			// na lista
			System.out.print(lista[i] + " ");
		}
		
		System.out.println("\n-------------");
		
		int i = 0;
		while(i < lista.length) {
			System.out.print(lista[i] + " ");
			
			i++;
		}
		
		System.out.println("\n-------------");
		
		
//		for (int i = 0; i < lista.length; i++) {
//			int numero = lista[i];
//			System.out.println(numero);
//		}
		
		// Para cada numero da lista
		// declare uma variável do tipo inteiro 
		// chamada num
		for (int num : lista) {
			System.out.print(num + " ");
		}
		
		System.out.println("\n-------------");
		
		
		System.out.print(
				// Para cada numero na lista
				Arrays.stream(lista)
				// Converte o tipo int para Integer
					.boxed()
				// Converta cada um em String
					.map(num -> num.toString())
				// Intercale cada um com espaço
				// e colete numa única String
					.collect(Collectors.joining(" ")));
			
	}
}
