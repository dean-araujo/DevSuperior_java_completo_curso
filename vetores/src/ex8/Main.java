package ex8;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar?");
		int n = sc.nextInt();
		int maiorIdade = 0;
		String nomeMaiorIdade = "";
		
		Pessoas[] pessoa = new Pessoas[n];
		
		for (int i = 0; i<pessoa.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa");
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			pessoa[i] = new Pessoas(nome, idade);
		}
		
		for (int i = 0; i<pessoa.length; i++) {
			if (pessoa[i].getIdade() > maiorIdade) {
				maiorIdade = pessoa[i].getIdade();
				nomeMaiorIdade = pessoa[i].getNome();
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + nomeMaiorIdade);
		
		sc.close();
	}

}
