import java.io.File;
import java.io.IOException;

public class FileCheck {
    public static void main(String[] args) {
        try {
            File f = new File("C:/Java/abc.txt");
            if (f.createNewFile()) {
                System.out.println("File created: " + f.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Check file properties
            System.out.println("Exists: " + f.exists());
            System.out.println("Is Directory: " + f.isDirectory());
            System.out.println("Is File: " + f.isFile());
            System.out.println("File Name: " + f.getName());
            System.out.println("Absolute Path: " + f.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
