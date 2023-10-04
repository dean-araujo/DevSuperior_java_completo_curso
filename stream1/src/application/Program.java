package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10); 	//Stream criada a partir da lista
																// Func map aplica uma func a cada elemento do stream
		System.out.println(Arrays.toString(st1.toArray())); 	//Operação terminal que converte uma Stream p/ um array, e imprime
		
		System.out.println("-----------------");
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		
		System.out.println("-----------------");
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2); //Potencialmente infinita
		System.out.println(Arrays.toString(st3.limit(10).toArray())); //limit - Necessário para não criar um array infinito
		
		System.out.println("-----------------");
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]); //Stream Fibonatti
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
		
	}

}
