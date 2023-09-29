package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		//Map<String, String> cookies3 = new LinkedHashMap<>(); //Velocidade média, ordena segundo a ordem do input;
		//Map<String, String> cookies2 = new HashMap<>(); //Mais rápido, não ordena os elementos;
		Map<String, String> cookies = new TreeMap<>(); //Mais lento, ordena pela chave;
		
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "997788554");
		
		cookies.remove("email");
		cookies.put("phone", "9977881133"); // sobrescreve o valor anterior

		System.out.println("Contains key phone: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: "  + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		
		System.out.println();
		System.out.println("ALL COOKIES: ");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		
		
		
	}
	
}
