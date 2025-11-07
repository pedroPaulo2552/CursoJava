package entities;

public class Individual extends TaxPayer {

	private Double healthExpeditures;
	
	
	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpeditures) {
		super(name, anualIncome);
		this.healthExpeditures = healthExpeditures;
	}

	
	public Double getHealthExpeditures() {
		return healthExpeditures;
	}

	public void setHealthExpeditures(Double healthExpeditures) {
		this.healthExpeditures = healthExpeditures;
	}

	
	
	@Override
	public double tax() {
		double basicTax;
		if(getAnualIncome() < 20000.0) {
			basicTax = getAnualIncome() * 0.15;
		} else {
			basicTax = getAnualIncome() * 0.25;
		}
		basicTax -= getHealthExpeditures() * 0.5;
		if(basicTax < 0.0) {
			basicTax = 0.0;
		}
		return basicTax;
	}

		
	
}
