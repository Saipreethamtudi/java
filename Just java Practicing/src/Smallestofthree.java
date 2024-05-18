import java.util.Scanner;

public class Smallestofthree {

	public static void main(String[] args) {
		Scanner S2 = new Scanner(System.in);
		
		int x = S2.nextInt();
		int y = S2.nextInt();
		int z = S2.nextInt();
		
		/*smallesfunction sf = new smallesfunction();
		int dd =  sf.find(x, y, z);
		 System.out.println(dd);*/
		 
		/* average a1 = new average();
		 int cc = a1.avg(x, y, z);
		 System.out.println(+ cc);*/
		 
		 middlenumbers m1 = new middlenumbers();
		 int[] ss = m1.middle(x);
		 System.out.println(ss);
		 
		 
	}
	
	//for the Largest of the three
	/*public static class smallesfunction{
		
		
		public int find(int x, int y, int z) {
		
		if(x>y && x>z) {
			return x;
		}
		else if(y>x && y>z) {
			return y;
		}
		else {
			return z;
		}

	}
	}*/
	
	
	
	//for the average of the three
	
	/*public static class average{
		public int avg(int x, int y, int z) {
			int sum = x+y+z;
			int avg = sum/3;
			return avg;
			}
	}*/
	
	//give the middle numbers

	
			
			
		}
	}
}

