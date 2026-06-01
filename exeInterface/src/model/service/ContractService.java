package model.service;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {
		
		LocalDate date = contract.getDate();
		double fixIns = contract.getTotalValue() / months;
		for(int i = 1; i <= months; i++) {
			double amount = 0;
			date = date.plusMonths(1);
			amount = onlinePaymentService.interest(fixIns, i);
			amount = onlinePaymentService.paymentFee(amount);
			Installment installment = new Installment(date, amount);
			contract.setInstallment(installment);
		}
		
	}
}
