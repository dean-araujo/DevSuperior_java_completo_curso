package udemy_curso_java_completo.cap3.ex3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student s1 = new Student(sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		
		System.out.println("FINAL GRADE = " + s1.finalGrade());
		System.out.println(s1.passOrFailed());
		System.out.println("MISSING " + s1.missing() + " POINTS");
		
		sc.close();
	}

}
