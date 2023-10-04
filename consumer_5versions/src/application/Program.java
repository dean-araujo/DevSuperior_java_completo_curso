package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//list.forEach(new PriceUpdate()); 									OR
		
		//list.forEach(Product::staticUpdatePrice); 						OR
		
		//list.forEach(Product::nonStaticUpdatePrice); 						OR
		
		//double factor = 1.1;
		//Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);
		//list.forEach(cons);												OR
		
		double factor = 1.1;
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		
		list.forEach(System.out::println);
		
	}
}
