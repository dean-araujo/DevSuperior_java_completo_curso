package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		// Princípio get/put - covariância
		List<Integer> myInts = new ArrayList<Integer>();
		myInts.add(5);
		myInts.add(15);
		
		List<? extends Number> list = myInts;
		
		Number x = list.get(0);
		System.out.println(x);
		
		//list.add(10); - erro de compilação
		
		// Princípio get/put - contravariância
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs;
		
		myNums.add(10);
		myNums.add(3.14);
		
		// Number y = myNums.get(0); - erro de compilação
		

			
	}

}
