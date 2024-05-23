package String;

import java.util.Scanner;

public class Comparetwostring {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		String s1 = S.nextLine();
		String s2 = S.nextLine();
		
		compare(s1,s2);

	}

	private static void compare(String s1, String s2) {
		if(s1.toLowerCase().equals(s2.toLowerCase())) {
			System.out.println("True");
		
		}
		else {
			System.out.println("False");
		}
		
		
		
	}

}
