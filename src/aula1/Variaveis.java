package aula1;

import java.util.Locale;

public class Variaveis {

	public static void main(String[] args) {
				Locale.setDefault(Locale.US);
				String nome = "Maria";
				int idade = 31;
				Double renda = 4000.0;
				System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
