package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);

		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
		
	}
	
	public static void printList(List<?> list) { // ? - É o super tipo de todos os tipos lista
		for (Object obj : list) {
			System.out.println(obj);
		}
		
	}

}
