import java.util.Scanner;

public class intrest {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		double IA = S.nextDouble();
		double ROI = S.nextDouble();
		int YR = S.nextInt();
		intrest(IA, ROI, YR);


	}

	private static void intrest(double IA, double ROI, int YR) {
		for(int i =1; i <= YR; i++) {
			System.out.println(i+"\t" + IA*Math.pow(1+ROI/1200,i*12) );
			
		}
		
	}

	
	

}
