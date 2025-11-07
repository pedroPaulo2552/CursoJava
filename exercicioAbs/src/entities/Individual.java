package entities;

public class Individual extends Taxpayers {
	private Double healthcare;
	
	public Individual() {
		super();
	}
	
	
	public Individual(String name, Double annualIncome, Double healthcare) {
		super(name, annualIncome);
		this.healthcare = healthcare;
	}


	public Double getHealthcare() {
		return healthcare;
	}


	public void setHealthcare(Double healthcare) {
		this.healthcare = healthcare;
	}


	@Override
	public Double taxCalculation() {
		double tax = 0;
		if (this.annualIncome < 20000.00) {
			tax = this.annualIncome * 0.15;
		} else {
			tax = this.annualIncome * 0.25;
		}
		
		if (this.healthcare > 0) {
			tax -= this.healthcare * 0.50;
		}
		
		return tax;
	}

}
