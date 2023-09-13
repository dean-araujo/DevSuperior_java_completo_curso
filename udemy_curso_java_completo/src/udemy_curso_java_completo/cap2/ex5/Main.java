package udemy_curso_java_completo.cap2.ex5;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		int code1 = input.nextInt();
		int num1 = input.nextInt();
		double price1 = input.nextDouble();
		int code2 = input.nextInt();
		int num2 = input.nextInt();
		double price2 = input.nextDouble();
		
		double total = (price1*num1) + (price2*num2);
		System.out.printf("VALOR A PAGAR = R$ %.2f%n", total);
		
		
		

	}

}
