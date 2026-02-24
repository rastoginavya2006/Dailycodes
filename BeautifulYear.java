import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the input year
        int year = sc.nextInt();
        
        // Loop until we find the next beautiful year
        while (true) {
            year++; // Start checking from the next year
            
            // Extract each digit
            int a = year / 1000;       // Thousands place
            int b = (year / 100) % 10; // Hundreds place
            int c = (year / 10) % 10;  // Tens place
            int d = year % 10;         // Units place
            
            // Check if all digits are distinct
            if (a != b && a != c && a != d && b != c && b != d && c != d) {
                System.out.println(year);
                break; // Exit the loop once found
            }
        }
        
        sc.close();
    }
}