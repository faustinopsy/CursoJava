package br.senai.sp.informatica.fundamentos.exemplos;

public class TesteDeConversao {
	public static void main(String[] args) {
		int x = 1123345567;
		System.out.println(x);
		
		float y = x;
		
		System.out.println(y);
		
		double y2 = x;
		
		System.out.println(y2);
		
		byte z = (byte)x;
		
		System.out.println(z);
	}
}
