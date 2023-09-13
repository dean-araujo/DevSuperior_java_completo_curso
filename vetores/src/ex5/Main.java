package ex5;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		double maiorNum = 0.0;
		int posicaoMaiorNum = 0;
		
		for(int i = 0; i<vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			
			if (vetor[i] > maiorNum) {
				maiorNum = vetor[i];
				posicaoMaiorNum = i;
			}
		}
		
		System.out.printf("MAIOR VALOR = %.2f\n", maiorNum);
		System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaiorNum);
		
		
		
				
		sc.close();

	}

}
