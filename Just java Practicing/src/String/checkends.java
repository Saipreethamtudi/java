package String;

import java.util.Scanner;

public class checkends {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		String s1 = S.nextLine();
		String s2 = S.nextLine();
		
		checkend(s1,s2);

	}

	private static void checkend(String s1, String s2) {
		boolean s3 = s1.endsWith(s2);
		if(s3) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}

}
