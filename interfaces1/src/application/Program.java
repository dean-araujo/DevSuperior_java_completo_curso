package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Enter rental data: ");
		System.out.print("Car model: ");
		String carModel = sc.nextLine();
		System.out.print("Pickup (DD/MM/YYYY hh:mm): ");
		LocalDateTime pickupDate = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Return (DD/MM/YYYY hh:mm): ");				
		LocalDateTime returnDate = LocalDateTime.parse(sc.nextLine(), fmt);
	
		CarRental cr = new CarRental(pickupDate, returnDate, new Vehicle(carModel));
	
		System.out.print("Enter price per hour: $");
		double pricePerHour = sc.nextDouble();
		System.out.print("Enter price per day: $");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		rentalService.processInvoice(cr);
		
		System.out.println();
		System.out.println("INVOICE: ");
		System.out.println("Base payment: " + String.format("%.2f",  cr.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + cr.getInvoice().getTax());
		System.out.println("Total payment: " + String.format("%.2f",  cr.getInvoice().getTotalPayment()));
		
		
		sc.close();
		
	}
}
