package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main (String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//list.removeIf(new ProductPredicate()); 				OR
		
		//list.removeIf(Product::nonStaticProductPredicate); 	OR
		
		//list.removeIf(Product::staticProductPredicate); 		OR
		
		//double min = 100.0;
		//Predicate<Product> pred = p -> p.getPrice() >= min;
		//list.removeIf(pred); 									OR
		
		double min = 100.0;
		list.removeIf(p -> p.getPrice() >= min);
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
