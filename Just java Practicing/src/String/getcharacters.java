package String;

import java.util.Scanner;

public class getcharacters {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		String s1 = S.nextLine();
		int s2 = S.nextInt();
		
		getatinex(s1,s2);

	}

	public static void getatinex(String s1, int s2) {
		
		if(s2>=0 && s2<s1.length()) {
			char s3 = s1.charAt(s2);
			System.out.println(s3);
		}else {
			System.out.println("False");
		}
		
		
	}

}
