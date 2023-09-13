package udemy_curso_java_completo.cap2.ex4;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int numFunc = input.nextInt();
		int horas = input.nextInt();
		double valorHora = input.nextDouble();
		
		double salario = horas * valorHora;
		
		System.out.println("NUMBER = " + numFunc);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		

	}
}
