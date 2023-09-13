package udemy_curso_java_completo.cap3.problema2POO;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		Product p1 = new Product(name, price, quantity);
		System.out.println(p1);
		
		System.out.println("Enter the number of products to be added in stock: ");
		p1.addProducts(sc.nextInt());
		System.out.print("Updated data: ");
		System.out.println(p1);
		
		System.out.println("Enter the number of products to be removed from stock: ");
		p1.RemoveProducts(sc.nextInt());
		System.out.print("Updated data: ");
		System.out.println(p1);
		
		sc.close();
		
		

	}

}
