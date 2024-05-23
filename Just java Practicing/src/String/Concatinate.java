package String;

import java.util.Scanner;

public class Concatinate {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		String s1 = S.nextLine();
		String s2 = S.nextLine();
		
		concatinate(s1,s2);

	}

	private static void concatinate(String s1, String s2) {
		//String s3 = s1+s2;
		String s3 = s1.concat(s2);
		System.out.println(s3);
	}

}
