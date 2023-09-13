package udemy_curso_java_completo.cap2.ex1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
			
		int a;
		int b;
		
		a = input.nextInt();
		b = input.nextInt();
		
		int resultado = a + b;
		
		System.out.println(a + " + " + b + " = " + resultado);
		
		input.close();

	}

}
