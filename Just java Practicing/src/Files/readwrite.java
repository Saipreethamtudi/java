package Files;

import java.io.File;

public class readwrite {

	public static void main(String[] args) {
		File F1 = new File("C:\\Users\\saipr\\OneDrive\\Desktop");
		String E1 = "bb.txt";
		File[] Store = F1.listFiles();

		if (Store != null) {
			for (File S : Store) {

				if (S.canRead() && S.canWrite()) {
					System.out.println("True");
					break;
				}
			}

		}
	}

}
