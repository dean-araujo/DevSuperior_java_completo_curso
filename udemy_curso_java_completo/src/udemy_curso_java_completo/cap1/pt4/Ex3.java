package udemy_curso_java_completo.cap1.pt4;

import java.util.Scanner;
import java.util.Locale;

public class Ex3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double media;
		
		for (int i = 0; i <= n; i++){
			double v1 = sc.nextDouble();
			double v2 = sc.nextDouble();
			double v3 = sc.nextDouble();
		
			media = (v1*2.0 + v2 * 3.0 + v3 * 5.0)/10.0;
			System.out.printf(".1f\n", media);
		}
		
		sc.close();
		

	}

}
