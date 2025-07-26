package entities;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public double aumentoSalario(double x) {
		return salarioBruto = ((x /100) * salarioBruto + salarioBruto);
	}
	
	public String toString() {
		return 	nome + ", $ " + String.format("%.2f", salarioLiquido());
				
	}
	
}
