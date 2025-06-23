package application;

import java.util.Locale;

import entities.Pessoa;

public class Secundarie {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Pessoa p1 = new Pessoa();
		p1.nome = "Pedro";
		p1.idade = 20;
		p1.altura = 1.66;
		/*System.out.println(p1.nome);
		System.out.println(p1.idade);
		System.out.println(p1.altura);*/
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Maria";
		p2.idade = 60;
		p2.altura = 1.50;
		System.out.println(p2.nome);
		System.out.println(p2.idade);
		System.out.println(p2.altura);
		
	}

}
