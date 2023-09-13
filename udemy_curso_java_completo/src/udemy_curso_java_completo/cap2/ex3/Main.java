package udemy_curso_java_completo.cap2.ex3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a, b, c, d;
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		d = input.nextInt();
		
		int diferenca = (a * b) - (c * d);
		
		System.out.println("DIFERENÇA = " + diferenca);
		
	}

}
