import java.util.Scanner;

public class stringvalid {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		String v1 = S.nextLine();
		check(v1);

	}

	private static void check(String v1) {
		
		
		
		if(v1.length()>= 10){
			int dcount = 0;
			
			for(int i = 0 ; i< v1.length(); i++) {
				
				char ch = v1.charAt(i);
				
				
				if(Character.isDigit(ch)) {
					dcount++;
					}
				else if (!Character.isLetter(ch))
				{
					System.out.println("False");
				}
			}
			if(dcount<= 2) {
				System.out.println("False");
			}else {
				System.out.println("True");
			}
			
		} 
		else {
			
			System.out.println("False");
		}
		
	}

}
