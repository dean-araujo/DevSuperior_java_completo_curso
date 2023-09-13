package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		int negative = 0;
		
		for (int i = 0; i<n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i<n; i++) {
			for (int j = 0; j < n; j++) {
				if ( i == j ) {
					System.out.println("Diagonal Principal");
					System.out.print(mat[i][j] + " ");
				}
				if ( mat[i][j] < 0) {
					negative++;
				}

			}
		}
		System.out.println();
		System.out.println("Negative numbers: " + negative);
		
		
	
		
		
		
		sc.close();
	}

}
