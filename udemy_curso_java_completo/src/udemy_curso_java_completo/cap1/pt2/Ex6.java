package udemy_curso_java_completo.cap1.pt2;

import java.util.Scanner;
import java.util.Locale;

public class Ex6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		double n = scanner.nextDouble();
		String intervalo;
		
		if (n > 0 && n <= 25) {
			intervalo = "Intervalo [0 , 25]";
		} else if (n > 25 && n <= 75){
			intervalo = "Intervalo (25, 50]";
		} else if (n > 75 && n <= 100){
			intervalo = "Intervalo (75, 110]";
		} else {
			intervalo = "Fora de Intervalo";
		}
		
		System.out.println(intervalo);
		
		scanner.close();
	}

}
