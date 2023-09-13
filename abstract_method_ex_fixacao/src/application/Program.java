package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contribuinte> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int taxPayers = sc.nextInt();
		
		for (int i = 0; i < taxPayers; i++) {
			System.out.println("Tax payer #" + (i+1) + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char ic = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if (ic == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpend = sc.nextDouble();
				list.add(new PessoaFisica(name, anualIncome, healthExpend));
			} else {
				System.out.print("Number of employees: ");
				Integer numEmployees = sc.nextInt();
				list.add(new PessoaJuridica(name, anualIncome, numEmployees));
			}
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		double totalTaxes = 0.0;
		for (Contribuinte payer : list) {
			System.out.println(payer);
			totalTaxes += payer.calcImposto();
		}
		
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
		
	
		
		sc.close();
	}

}
