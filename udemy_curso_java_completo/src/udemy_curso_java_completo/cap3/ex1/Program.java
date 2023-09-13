package udemy_curso_java_completo.cap3.ex1;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo r1 = new Retangulo();
		
		System.out.println("Enter rectangle width and height: ");
		r1.setWidth(sc.nextDouble());
		r1.setHeight(sc.nextDouble());
		
		System.out.println(r1.toString());
		
		sc.close();
	}

}
