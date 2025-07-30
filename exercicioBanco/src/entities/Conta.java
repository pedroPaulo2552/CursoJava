package entities;

public class Conta {
	private String nome;
	private int numeroDaconta;
	private double saldo;
	
	
	public Conta(String nome, int numeroDaConta) {
		this.nome = nome;
		this.numeroDaconta = numeroDaConta;
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public void saque(double valor) {
		this.saldo -= (valor + 5);
	}
	
	public String getNome() {
		return nome;
	}

	public int getNumeroDaconta() {
		return numeroDaconta;
	}

	public String getSaldo() {
		return String.format("%.2f", this.saldo);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void showConta() {
		System.out.println();
	}
}
