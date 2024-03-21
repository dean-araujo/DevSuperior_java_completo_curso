package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
	
	public static void main (String[] args) {
		
		Map<String, Integer> ballotBox = new HashMap<>();
		
		System.out.println("Type the file's path: ");
		
		try (BufferedReader br = new BufferedReader(new FileReader("c://temp//in.txt"))){
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				line = br.readLine();
				String candidate = fields[0];
				Integer votes = Integer.parseInt(fields[1]);
				
				if (ballotBox.containsKey(candidate)) {
					ballotBox.put(candidate, ballotBox.get(candidate) + votes);
				} else {
					ballotBox.put(candidate, votes);
				}
				
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
			
		for (String key : ballotBox.keySet()) {
			System.out.println(key + ": " + ballotBox.get(key));
		}
	}
}
