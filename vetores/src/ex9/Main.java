package ex9;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quanto alunos serao digitados? ");
		int n = sc.nextInt();
		
		Alunos[] aluno = new Alunos[n];
		
		for(int i = 0; i < aluno.length; i++) {
			System.out.println("Digite nome, primeira e segunda do do " 
		    + (i+1) + "o aluno: ");

			aluno[i] = new Alunos(sc.next(), sc.nextDouble(), sc.nextDouble());
		}
		
		for(int i = 0; i < aluno.length; i++) {
			if (aluno[i].calcMedia(aluno[i].getN1(), aluno[i].getN2()) >= 6.0) {
				System.out.println(aluno[i].getNome());
			}
		}
			
		
		sc.close();
	}

}
