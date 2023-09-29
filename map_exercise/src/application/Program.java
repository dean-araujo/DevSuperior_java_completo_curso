package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> ballotBox = new HashMap<>();
		
		System.out.print("Enter file full path: ");
		String path = sc.next();
		
	
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String candidate = fields[0];
				Integer ballotBoxVotes = Integer.parseInt(fields[1]);
				
				if (ballotBox.containsKey(candidate)) {
					ballotBox.put(candidate, ballotBox.get(candidate) + ballotBoxVotes);	
				} else {
					ballotBox.put(candidate, ballotBoxVotes);
				}
				
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		for (String key : ballotBox.keySet()) {
			System.out.println(key + ": " + ballotBox.get(key));
		}
		
		sc.close();
		
	}
	
}
