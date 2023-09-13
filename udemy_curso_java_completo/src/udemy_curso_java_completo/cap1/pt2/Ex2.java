package udemy_curso_java_completo.cap1.pt2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		scanner.close();
	}

}
