package udemy_curso_java_completo.cap1.pt4;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i<=n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (b == 0) {
				System.out.println("divisao impossivel");
			}else {
				double div = (float)a/b;
				System.out.println(div);
			}
			
		}
		
		sc.close();

	}

}
