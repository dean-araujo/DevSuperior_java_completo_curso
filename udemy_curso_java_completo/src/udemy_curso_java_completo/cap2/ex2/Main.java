package udemy_curso_java_completo.cap2.ex2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		double raio;
		double PI = 3.14159;
		
		raio = input.nextDouble();
				
		double area = PI*Math.pow(raio, 2);
		
		System.out.printf("A= %.4f%n", area);
		
		
		

	}

}
