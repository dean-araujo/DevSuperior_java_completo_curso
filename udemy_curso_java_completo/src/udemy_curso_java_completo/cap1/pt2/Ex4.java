package udemy_curso_java_completo.cap1.pt2;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int hrInicial = scanner.nextInt();
		int hrFinal = scanner.nextInt();
		int duracao;
		
		if (hrInicial < hrFinal) {
			duracao  = hrInicial - hrFinal;
		}else{
			duracao = 24 - hrInicial + hrFinal;
		}
		
		System.out.println("O JOGO DUROU " + Math.abs(duracao) + " HORA(S)");
		
		scanner.close();
		

	}

}
