package ex7;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros vai ter no vetor? ");
		int n = sc.nextInt();
		int somaPar = 0, contPar = 0;
		double mediaPar;
		
		int[] vetor = new int[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
			if (vetor[i] % 2 == 0) {
				somaPar += vetor[i];
				contPar++;
			}
		}
		
		
		if(somaPar == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			mediaPar = somaPar/contPar;
			System.out.println("Media dos pares: " + mediaPar);
		}
		
		sc.close();
	}
}
