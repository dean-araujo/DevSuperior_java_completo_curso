package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory); //Directories list//
		System.out.println("FOLDERS: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		System.out.println();
		File[] files = path.listFiles(File::isFile); //Files list//
		System.out.println("FILES: ");
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\subdir").mkdir(); //Create a new subdir folder
		System.out.println("Directory created with success: " + success);		
		
		
		sc.close();
		
	}

}
