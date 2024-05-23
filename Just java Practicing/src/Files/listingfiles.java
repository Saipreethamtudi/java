package Files;

import java.io.File;

public class listingfiles {

	public static void main(String[] args) {
		File storinghere = new File("C:\\Users\\saipr\\OneDrive\\Desktop");

		File[] storelist = storinghere.listFiles();

		for (File f : storelist) {
			System.out.println(f);
		
		}
	}

}
