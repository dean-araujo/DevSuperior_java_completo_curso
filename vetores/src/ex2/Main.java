package ex2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();		
		double[] vetor = new double[n];
		double soma = 0, media;
		
		for (int i = 0; i<vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}
		
		media = soma / vetor.length;
		
		System.out.print("VALORES = ");
		for (int i = 0; i<vetor.length; i++) {
			System.out.print(vetor[i]);
		}
		
		System.out.println();
		System.out.printf("SOMA = %.2f\n" , soma);
		System.out.printf("MEDIA = %.2f\n", media);
		
		sc.close();
	}

}
