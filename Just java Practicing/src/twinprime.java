import java.util.Scanner;

public class twinprime {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int pn = S.nextInt();
		
		primenumbers(pn);
		

	}

	private static void primenumbers(int pn) {
		for (int i =2 ; i<= pn; i++) {
			if(prime(i)) {
				System.out.println(i);
			}
			
		}
		
	}

	private static boolean prime(int i) {
		if(i<=2 && i%2 == 0) {
			return false;
		}
		for(int j = 2; j <= i; j++) {
			if(j % i == 0) {
				return false;
			}
		}
		return true;
	}

}
