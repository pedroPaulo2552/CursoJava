package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	private Integer number;
	private LocalDate date;
	private Double totalValue;
	
	private List<Installment> installment;
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Contract() {
	}

	public Contract(Integer number, LocalDate date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		this.installment = new ArrayList<>();
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}
	
	public void setInstallment(Installment installment) {
		this.installment.add(installment);
	}
	
	public void getInstallment() {
		for(Installment i : this.installment) {
			System.out.println(i.getDueDate().format(fmt) + " - " + String.format("%.2f", i.getAmount()));
		}
	}
	
	
}
