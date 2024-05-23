package Files;

import java.io.File;

public class fileextension {

	public static void main(String[] args) {
		File F1 = new File("C:\\Users\\saipr\\OneDrive\\Desktop");
		String E1 = ".txt";
		File[] Store = F1.listFiles();

		if (Store != null) {
			for (File f : Store) {

				if (f.getName().endsWith(E1)) {
					System.out.println(f.getName());
				}
			}
		} else {
			System.out.println("Not Present");

		}
	}
}
