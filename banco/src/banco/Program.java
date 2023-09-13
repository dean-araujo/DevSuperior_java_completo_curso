package banco;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		
		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit? (y/n)");
		char condition = sc.next().charAt(0);
		double initialDeposit = 0.0;
		
		if (condition == 'y') {
			System.out.print("Enter initial deposite value: ");
			initialDeposit = sc.nextDouble();
		}
		Conta ac1 = new Conta(account, holder, initialDeposit);
		System.out.println(ac1.toString());
		
		System.out.print("Enter a deposit value: $");
		ac1.deposit(sc.nextDouble());
		System.out.println(ac1.toString());
		
		System.out.print("Enter a withdraw value: $");
		ac1.withdraw(sc.nextDouble());
		System.out.println(ac1.toString());
		
		
		
		sc.close();
	}

}
