package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String abc = "";
		Set<Student> set = new HashSet<>();
		int nStudents = 0;
		int idStudent = 0;
		

		int n = 3;
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				abc = "A";
			} else if (i == 1) {
				abc = "B";
			} else { 
				abc = "C";
			}
			
			System.out.print("How many students for course " + abc + "? ");
			nStudents = sc.nextInt();
			
			for (int j = 0; j< nStudents; j++) {
				set.add(new Student(sc.nextInt()));
			}
			
		}
		
		int sum = 0;
		for (Student s : set) {
			sum +=1;
		}
	
		System.out.println("Total students: " + sum);
		sc.close();
		
	}
	
}
