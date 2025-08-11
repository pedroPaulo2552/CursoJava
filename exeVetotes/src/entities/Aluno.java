package entities;

public class Aluno {
	private String nome;
	private double nota1;
	private double nota2;
	private double media;
	public Aluno(String nome, double nota1, double nota2, double media) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.media = media;
	}
	public String getNome() {
		return nome;
	}
	public double getMedia() {
		return media;
	}
	
	
}
