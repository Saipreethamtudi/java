
public class sumofdig {

	public static void main(String[] args) {
		int value = 23232;
		number(value);

	}
	
	public static void number(int value) {
		String v1 = String.valueOf(value);
		int count = 0;
		
		for(int i = 0; i< v1.length();i++) {
			char dig = v1.charAt(i);
			int dig1 = Character.getNumericValue(dig);
			count = count+dig1;
			
		}
		
		System.out.println(count);
		
		
	}

}
