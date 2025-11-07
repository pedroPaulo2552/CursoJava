package entities;

public class LegalEntity extends Taxpayers {
	private Integer employees;
	
	public LegalEntity() {
		super();
	}
	
	public LegalEntity(String name, Double annualIncome, Integer employees) {
		super(name, annualIncome);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	
	@Override
	public Double taxCalculation() {
		double tax = 0;
		if (this.employees > 10) {
			tax = this.annualIncome * 0.14;
		} else {
			tax = this.annualIncome * 0.16;
		}
		
		return tax;
	}

}
