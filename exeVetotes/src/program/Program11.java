package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int c = sc.nextInt();
		
		Pessoa[] vet = new Pessoa[c];
		
		double maiAlt = 0;
		double menAlt = 0;
		int mulheres = 0;
		double somaMulheres = 0;
		int homens = 0;
		for (int i = 1; i <= vet.length; i++) {
			System.out.print("Altura da " + i + "a pessoa: ");
			double altura = sc.nextDouble();
			System.out.print("Genero da " + i + "a pessoa: ");
			sc.nextLine();
			char sexo = sc.next().charAt(0);
			vet[i - 1] = new Pessoa(sexo, altura);
			
			if (altura > maiAlt) {
				maiAlt = altura;
			} 
			
			if (menAlt == 0 || altura < menAlt) {
				menAlt = altura;
			}
			
			if (sexo == 'F') {
				mulheres++;
				somaMulheres += altura;
			} else {
				homens++;
			}
			
		}
		double mediaMulheres = (double) somaMulheres / mulheres;
		
		System.out.println("Menor altura = " + menAlt);
		System.out.println("Maior altura = " + maiAlt);
		System.out.printf("Media das alturas das mulheres %.2f%n", mediaMulheres);
		System.out.println("Número de homens = " + homens);
		
		sc.close();

	}

}
