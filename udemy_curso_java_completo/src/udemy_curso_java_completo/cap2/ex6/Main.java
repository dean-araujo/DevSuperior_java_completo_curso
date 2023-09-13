package udemy_curso_java_completo.cap2.ex6;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble();
		double PI = 3.14159;
		double triangulo = (a*c)/2, circulo = PI*Math.pow(c, 2), trapezio = (a+b)*c/2, quadrado = b*b, retangulo = a*b;

		System.out.printf("TRIANGULO = %.3f%n", triangulo);
		System.out.printf("CIRCULO = %.3f%n", circulo);
		System.out.printf("TRAPEZIO = %.3f%n", trapezio);
		System.out.printf("QUADRADO = %.3f%n", quadrado);
		System.out.printf("RETANGULO = %.3f%n", retangulo);
		
		

	}

}
