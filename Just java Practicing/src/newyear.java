import java.util.Scanner;

public class newyear {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int year = S.nextInt();
		
		leapyear(year);
		

	}

	private static void leapyear(int year) {
		
		if(year % 4 == 0 && year % 100 != 0){
			System.out.println("True");
			
		}else {
			System.out.println("False");
		}
		
	}

}
