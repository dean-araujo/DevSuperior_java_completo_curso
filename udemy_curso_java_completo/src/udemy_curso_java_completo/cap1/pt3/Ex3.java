package udemy_curso_java_completo.cap1.pt3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int alcool = 0, gasolina = 0, diesel = 0;
		int option = sc.nextInt();
		
		while (option != 4) {
			switch(option){
			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			case 3:
				diesel += 1;
				break;
			case 4:
				break;
			default:
				break;
			}
			
			option = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diese: " + diesel);
		
		sc.close();
		
	}

}
