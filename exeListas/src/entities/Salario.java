package entities;

public class Salario {
	private double salary;

	public Salario(double salary) {
		this.salary = salary;
	}

	public String getSalary() {
		return String.format("%.2f", this.salary);
	}

	public void aumento(double porc) {
		this.salary = ((porc / 100) * this.salary) + this.salary; 
	}
	
	
}
