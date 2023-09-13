package udemy_curso_java_completo.cap3.exercicioFixacao;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		double dollar = sc.nextDouble();
		System.out.print("How many dollar will be bought? ");
		double quantity = sc.nextDouble();
		System.out.println("Amount do be paid in reais = " + String.format("%.2f", CurrencyConverter.converter(dollar, quantity)));
				
		sc.close();
	}

}
