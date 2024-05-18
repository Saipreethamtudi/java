import java.util.Scanner;

public class consecutive {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int S1 = S.nextInt();
		int S2 = S.nextInt();
		int S3 = S.nextInt();
		
		Consecutie(S1,S2,S3);

	}

	private static void Consecutie(int S1, int S2, int S3) {
	     if(S2 - S1 == S3 -S2 ){
	    	 System.out.println("True");
	     }else {
	    	 System.out.println("False");
	     }
		
	}

}
