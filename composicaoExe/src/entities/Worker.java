package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private List<HourContract> contracts  = new ArrayList<>();

	public Worker() {
	}
	

	public Worker(String name, WorkerLevel level, Double baseSalary) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
	}
	
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public WorkerLevel getLevel() {
		return level;
	}


	public void setLevel(WorkerLevel level) {
		this.level = level;
	}


	public Double getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	
	public void addContract(HourContract contract) {
		this.contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		this.contracts.remove(contract);
	}
	
	
	public double income(int year, int month) {
		for (int i = 0; i < this.contracts.size(); i++) {
			int ano = this.contracts.get(i).getDate().getYear();
			int mes = this.contracts.get(i).getDate().getMonthValue() + 1;
			if (ano == year && mes == month) {
				double totalContract =  this.contracts.get(i).totalValue();
				return totalContract + this.baseSalary;
			}
		}
		return 0;
	}
	
	
}
