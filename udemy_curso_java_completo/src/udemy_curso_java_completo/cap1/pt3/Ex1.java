package udemy_curso_java_completo.cap1.pt3;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int senhaDig = sc.nextInt();
		int senhaGuard = 2002;
		
		while (senhaDig != senhaGuard) {
			System.out.println("Senha Inválida");
			senhaDig = sc.nextInt();
		}
		
		System.out.println("Acesso permitido");
		sc.close();
	}

}
