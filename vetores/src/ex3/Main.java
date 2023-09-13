package ex3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantas pessoas serao digitas? ");
		int n = sc.nextInt(), somaMenor16 = 0;
		double altSoma = 0.0, altMedia, menor16;
		
		
		Pessoas[] pessoa = new Pessoas[n];
		for (int i = 0; i<pessoa.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			pessoa[i] = new Pessoas(nome, idade, altura);
			altSoma += pessoa[i].getAltura();
			
			if (pessoa[i].getIdade() < 16) {
				somaMenor16++;
			}
		}
				
		altMedia = altSoma / pessoa.length;
		menor16 = ((double)somaMenor16/n)*100;
		System.out.printf("Altura média: %.2f\n", altMedia);
		System.out.println("Pessoas com menos de 16 anos: " + menor16 + "%");
		
		for (int i = 0; i<pessoa.length; i++) {

			if (pessoa[i].getIdade() < 16) {
				System.out.println(pessoa[i].getNome());
			}

		}
		

		
		sc.close(); 
	}

}
