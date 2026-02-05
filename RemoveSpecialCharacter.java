import java.util.Scanner;

public class RemoveSpecialCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        // Remove special characters
        String cleanStr = str.replaceAll("[^a-zA-Z0-9 ]", "");

        System.out.println("Original String: " + str);
        System.out.println("Cleaned String: " + cleanStr);

        sc.close();
    }
}
