package udemy_curso_java_completo.cap1.pt2;

import java.util.Locale;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Ex5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Map<Integer, Double> products = new HashMap<>();
		char cont = 'Y';
		int codScan, quantScan;
		double total = 0.0;
		
		products.put(1, 4.0);
		products.put(2, 4.5);
		products.put(3, 5.0);
		products.put(4, 2.0);
		products.put(5, 1.5);
		
		while (cont =='Y') {
			System.out.println("Cadastro de Produtos");
			System.out.println("CÓDIGO PRODUTO: ");
			codScan = scanner.nextInt();
			System.out.println("Quantidade: ");
			quantScan = scanner.nextInt();
				
			total = total + (products.get(codScan) * quantScan);
	
			System.out.println("Continue? [Y/N] ");
			cont = scanner.next().charAt(0);
		}
		
		System.out.println("TOTAL: R$" + total);
		
		scanner.close();

	}

}
