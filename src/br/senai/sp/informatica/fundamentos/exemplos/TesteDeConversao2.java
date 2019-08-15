package br.senai.sp.informatica.fundamentos.exemplos;

public class TesteDeConversao2 {
	public static void main(String[] args) {
		Integer x = 1123345567;
		
		x++;
		
		System.out.println(x);
		
		Float y = x.floatValue();
		
		System.out.println(y);
		
		Double y2 = x.doubleValue();
		
		System.out.println(y2);
		
		Byte z = x.byteValue();
		
		System.out.println(z);
		
		int k = x;
		
		x = null;
		
		System.out.println(k);
		
		//System.out.println(x.intValue());
		
		//k = null;
		
		TesteInteiro t = new TesteInteiro();
		System.out.println(t);
		
		String texto = "Teste";
		char teste = 'T';
		
		System.out.println(texto + " " + teste);
	}
}


class TesteInteiro {
	Integer num1;
	int num2;
	char letra1;
	Character letra2;
	
	@Override
	public String toString() {
		return "num1: " + num1 + " num2: " + num2 + " letra1: " + letra1 + " letra2: " + letra2;
	}
}