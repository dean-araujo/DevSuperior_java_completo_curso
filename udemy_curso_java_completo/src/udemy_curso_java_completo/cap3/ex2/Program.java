package udemy_curso_java_completo.cap3.ex2;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee e1 = new Employee();
		
		System.out.print("Name: ");
		e1.setName(sc.nextLine());
		System.out.print("Gross salary: ");
		e1.setGrossSalary(sc.nextDouble());
		System.out.print("Tax: ");
		e1.setTax(sc.nextDouble());
		
		System.out.println(e1.toString());
		
		System.out.print("Which percentage to increase salary? ");
		e1.increaseSalary(sc.nextDouble());
		
		System.out.println(e1.toString());
		
		sc.close();
	}

}
