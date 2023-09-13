package udemy_curso_java_completo.cap3.problemaPOO;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo t1 = new Triangulo(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), "t1");
		Triangulo t2 = new Triangulo(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), "t2");
		double a1 = t1.calcArea(), a2 = t2.calcArea();
		String larger = t1.largerArea("t1", a1, "t2", a2);
		
		System.out.println("Triangle " + t1.getName() + " area: " + a1);
		System.out.println("Triangle " + t2.getName() + " area: " + a2);
		System.out.println("Larger area: " + larger );

	}

}
