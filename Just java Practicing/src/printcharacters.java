import java.util.Scanner;

public class printcharacters {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		char v1 = S.next().charAt(0);
		char v2 = S.next().charAt(0);

		printbetweencharacters(v1, v2);
	}

	private static void printbetweencharacters(char v1, char v2) {
		
		int start = v1;
		int end = v2;
		
		for(int i= start +1 ; i< end; i++) {
		
			System.out.println((char)i);
		}
	}

}
