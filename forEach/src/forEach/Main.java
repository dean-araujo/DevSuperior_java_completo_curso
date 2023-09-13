package forEach;

public class Main {

	public static void main(String[] args) {
	
		String[] list = new String[] {"Maria", "José", "Pedro"};
		int i = 0;
		
		for (String nome : list) {

			System.out.println(list[i]);
			i++;
		}
		

	}

}
