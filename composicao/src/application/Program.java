package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		Department department = new Department(sc.next());
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Level: ");
		WorkerLevel level = WorkerLevel.valueOf(sc.next().toUpperCase());
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();

		Worker w1 = new Worker(name, level, baseSalary, department);
		
		System.out.println("How many contracts to this worker?");
		Integer numContracts = sc.nextInt();
		
		for (int i = 0; i < numContracts; i++) {
			System.out.println("Enter contract #" + (i+1) + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			Integer hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			w1.addContrat(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income: (MM/YYYY)");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + w1.getName());
		System.out.println("Department: " + w1.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", w1.income(year, month)));
		
		
		sc.close();
		
	}

}
