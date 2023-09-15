package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.service.ContractService;
import model.service.PaypalService;

public class Program {
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter the contract data: ");
		System.out.print("Number: ");
		int contractNumber = sc.nextInt();
		System.out.print("Date (DD/MM/YYYY): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Contract value: ");
		Double contractValue = sc.nextDouble();
		
		Contract contract = new Contract(contractNumber, date, contractValue);
		
		System.out.print("Enter the total installmens: ");
		int installments = sc.nextInt();
		new ContractService(new PaypalService()).processContract(contract, installments);
		
		
		System.out.println("Installments: ");
		
		for (Installment installment : contract.getInstallments()) {
		System.out.println(installment);
		}
			
	
		sc.close();
	}
}
