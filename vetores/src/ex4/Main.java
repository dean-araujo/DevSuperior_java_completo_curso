package ex4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numero voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] num = new int[n];
		int quantPares = 0;
		
		for (int i = 0; i<num.length; i++){
			System.out.print("Digite um numero: ");
			num[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS PARES: ");
		for (int i = 0; i<num.length; i++){
			if (num[i] % 2 == 0) {
				System.out.print(String.format("%d ", num[i]));
			quantPares++;
			}
		}
		
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + quantPares);

		
		
		sc.close();

	}

}
