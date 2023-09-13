package udemy_curso_java_completo.cap1.pt4;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), fat = 1;
		
		for (int i = 1; i <= n ; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		sc.close();
		
	}

}
