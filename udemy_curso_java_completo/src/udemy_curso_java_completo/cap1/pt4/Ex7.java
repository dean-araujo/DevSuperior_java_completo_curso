package udemy_curso_java_completo.cap1.pt4;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int pri = i;
			int seg = i*i;
			int ter = i*i*i;
			System.out.printf("%d %d %d\n", pri, seg, ter);
		}
		sc.close();
	}

}
