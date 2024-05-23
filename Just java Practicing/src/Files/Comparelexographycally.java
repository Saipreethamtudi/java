package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Comparelexographycally {

	public static void main(String[] args) {
		String path1 = "C:\\Users\\saipr\\OneDrive\\Desktop\\bb.txt";
        String path2 = "C:\\Users\\saipr\\OneDrive\\Desktop\\cc.txt";

        try {
            boolean areEqual = compareFileContent(path1, path2);
            System.out.println(areEqual ? "Files have identical content lexicographically."
                                         : "Files have different content lexicographically.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    public static boolean compareFileContent(String path1, String path2) throws IOException {
        try (BufferedReader reader1 = new BufferedReader(new FileReader(path1));
             BufferedReader reader2 = new BufferedReader(new FileReader(path2))) {
            String line1, line2;
            while ((line1 = reader1.readLine()) != null && (line2 = reader2.readLine()) != null) {
                if (!line1.equals(line2)) {
                    return false;
                }
            }
            return reader1.readLine() == null && reader2.readLine() == null;
        }
    }
}
