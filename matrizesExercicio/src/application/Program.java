package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] mat = new int[sc.nextInt()][sc.nextInt()];
		
		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				mat[l][c] = sc.nextInt();
			}
		}

		int num = sc.nextInt();
		
		for (int l = 0; l < mat.length; l++ ) {
			for (int c = 0; c < mat[l].length; c++) {
				if (num == mat[l][c]) {
					System.out.println("Position: " + l + "," + c + ":");
					
					if (c > 0 ) {
						System.out.println("Left: " + mat[l][c-1]);
					}
					if (l > 0 ) {
						System.out.println("Up: " + mat[l-1][c]);
					}
					if (c > mat[l].length-1) {
						System.out.println("Right: " + mat[l][c+1]);
					}
					if (c > mat.length -1) {
						System.out.println("Down: " + mat[l+1][c]);
					}
					
					System.out.println();
				}
				
			}
		}
		
		sc.close();
		
		
	}

}
