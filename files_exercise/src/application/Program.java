	package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		System.out.println("Enter file path: ");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String strPath = sc.nextLine();
		try (BufferedReader br = new BufferedReader(new FileReader(strPath))){
		
			String line = br.readLine();
			
			while(line != null) {
				String[] elements = line.split(",");
				line = br.readLine();
		
				String name = elements[0];
				Double  price = Double.parseDouble(elements[1]);
				Integer quantity = Integer.parseInt(elements[2]);
				
				Product product = new Product(name, price, quantity);
				new File("c:\\temp" + "\\out").mkdir();
				File path = new File(strPath);
				
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(path.getParent()+"\\out\\summary.csv", true))){
				
					bw.write(product.toString());					
					bw.newLine();
				}
				catch (IOException e) {
					System.out.println("Error: " + e.getMessage());
				}				
			}		
		}
		catch (IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}
