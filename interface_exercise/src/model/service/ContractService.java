package model.service;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService ops;
	
	public ContractService(OnlinePaymentService ops) {
		this.ops = ops;
	}
		
	public void processContract(Contract contract, Integer months) {

		Double amount = contract.getTotalValue() / months;
		for (int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			Double interest = ops.interest(amount, i);
			Double fee = ops.paymentFee(amount + interest);
			Double installmentAmount = amount + interest + fee;
			contract.addInstallment(new Installment(dueDate, installmentAmount));  
		}
	}
	
}
