import java.util.Scanner;

public class middle {

	public static void main(String[] args) {
		
	Scanner Str = new Scanner(System.in);
	String value = Str.nextLine();
	
	int S1 = value.length()/2;
	
	if(value.length()%2 == 1) {
		System.out.println(value.charAt(S1));
	}
	else {
		System.out.println(value.substring(S1 - 1, S1 + 1));
	}
	}

}

