package entities;

public class Estudante {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public void situacao() {
		if (notaFinal() >= 60) {
			System.out.println("APROVADO");
		} else {
			System.out.println("REPROVADO");
			double pontos = 60 - notaFinal();
			System.out.printf("PRECISA DE %.2f PONTOS", pontos);
		}
	}
}
