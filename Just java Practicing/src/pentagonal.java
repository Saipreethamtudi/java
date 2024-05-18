import java.util.Scanner;

public class pentagonal {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		
		pentagonal(n);

	}

	private static void pentagonal(int n) {
		
		
		for(int i = 1; i<= n;i++) {
			System.out.println(i * (3 * i - 1) / 2);
			
			
		}
		
	}

}
