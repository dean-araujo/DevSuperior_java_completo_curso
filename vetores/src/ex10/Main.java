package ex10;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		double maiorAltG = 0, menorAltG = 999999, somaAltF = 0.0, medAltF;
		int numM = 0, numF = 0;
		
		Pessoas[] pessoa = new Pessoas[n];
		
		for(int i = 0; i < pessoa.length; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			double altura = sc.nextDouble();
			System.out.print("Genero da " + (i+1) + "a pessoa: ");
			char genero = sc.next().charAt(0);
			
			pessoa[i] = new Pessoas(altura, genero);
			
			if (pessoa[i].getAltura() > maiorAltG) {
				maiorAltG = pessoa[i].getAltura();
			} else if (pessoa[i].getAltura() < menorAltG){
				menorAltG = pessoa[i].getAltura();
			}

			if (pessoa[i].getGenero() == 'F') {
				somaAltF += pessoa[i].getAltura();
				numF++;
			} else {
				numM++;
			}
		}
		
		medAltF = somaAltF / numF;
				
		System.out.println("Menor altura = " + menorAltG);
		System.out.println("Maior altura = " + maiorAltG);
		System.out.printf("Media das alturas das mulheres = %.2f\n", medAltF);
		System.out.println("Numero de homens = " + numM);
		
		sc.close();

	}

}
