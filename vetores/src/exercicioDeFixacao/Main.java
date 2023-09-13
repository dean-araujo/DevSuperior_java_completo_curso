package exercicioDeFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("How many rooms will be rented?" );
		int n = sc.nextInt();
		
		Renter[] rooms = new Renter[10];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i+1));
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			rooms[roomNumber] = new Renter(name, email, roomNumber);
		}
		
		System.out.println("Busy rooms: ");
			
		for (int i = 0; i < rooms.length; i++) {
				if (rooms[i] != null) {
					System.out.println(rooms[i]);
				}
				
		}
			
		sc.close();
	}
}
