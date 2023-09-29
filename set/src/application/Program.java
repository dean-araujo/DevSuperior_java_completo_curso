package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		/*HashSet
		 * Implementação mais rápida, utiliza comparações de HashCode, Equals (e ponteiros);
		 * Não concede ordem aos elementos;	
		 */
		
		Set<String> set = new HashSet<>(); 
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		System.out.println("HashSet");
		System.out.println(set.contains("Notebook"));

		for (String p : set) {
			System.out.println(p);
		}
		
		System.out.println("-----------------");
		System.out.println("TreeSet");
		
		/*TreeSet
		 * Implementação mais lenta, utiliza comparações de árvore rubro negra;
		 * Ordena os dados (aqui, como String, por ordem alfabética);	
		 */
		
		Set<String> set1 = new TreeSet<>(); 
		
		set1.add("Tv");
		set1.add("Tablet");
		set1.add("Notebook");
		
		System.out.println(set1.contains("Notebook"));

		for (String p : set1) {
			System.out.println(p);
		}
		
		
		System.out.println("-----------------");
		System.out.println("LinkedHashSet");
		
		/*LinkedHashSett
		 * Implementação intermediária;
		 * Mantém a ordem em que os elementos são inseridos;	
		 */
		
		Set<String> set2 = new LinkedHashSet<>(); 
		
		set2.add("Tv");
		set2.add("Tablet");
		set2.add("Notebook");
		set2.add("Bike");
		set.add("Car");
		
		System.out.println(set2.contains("Notebook"));

		for (String p : set2) {
			System.out.println(p);
		}	
		
		set.remove("Car");
		set2.removeIf(x -> x.length() >= 3);
		
		
		System.out.println();
		
		for (String p : set2) {
			System.out.println(p);
		}
	}

}
