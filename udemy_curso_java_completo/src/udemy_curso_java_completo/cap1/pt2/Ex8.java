package udemy_curso_java_completo.cap1.pt2;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salary = sc.nextDouble();
		double totImp;
		
		if (salary > 0.0  && salary <= 2000.00) {
			System.out.println("Isento");
		} else if (salary <= 3000.00){
			totImp = (salary - 2000.00)*0.08;
			System.out.printf("R$ %.2f\n", totImp);
		} else if (salary <= 4500.00){
			totImp = ((salary - 3000.00)*0.18 + (1000*0.08));
			System.out.printf("R$ %.2f\n", totImp);
		} else if (salary > 4500.00) {
			totImp = (salary - 4500.0)*0.28 + 1500.0*0.18 + 1000.0*0.08;
			System.out.printf("R$ %.2f\n", totImp);
		} else {
			System.out.println("ERRO!");
		}

		sc.close();
	}
}
