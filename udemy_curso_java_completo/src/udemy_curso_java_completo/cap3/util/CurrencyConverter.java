package util;

public class CurrencyConverter {

	public static double converter(double dollar, double quantity) {
		
		return (dollar * quantity) + (dollar * quantity)*0.06;
	}
	
}
