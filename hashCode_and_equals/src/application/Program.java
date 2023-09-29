package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "test";
		String s2 = "test";
		
		String s3 = new String("Test");
		String s4 = new String("Test");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2)); // Comparar o conteúdo dos objs
		System.out.println(c1 == c2); //Comparar as referências na memória dos objs
		System.out.println(s1 == s2); //Tratamento especial para literais
		System.out.println(s3 == s4); 
	}

}
