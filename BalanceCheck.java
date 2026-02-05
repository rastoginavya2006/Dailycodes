import java.util.Scanner;

public class BalanceCheck {
    
    public boolean isBalanced(String num) {
        int evenSum = 0;
        int oddSum = 0;   

        for (int i = 0; i < num.length(); i++) {
            
            int digit = num.charAt(i) - '0'; 

            if (i % 2 == 0) {
                evenSum += digit;
            } else {          
                oddSum += digit;
            }
        }

        return evenSum == oddSum;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        BalanceCheck solution = new BalanceCheck();

        System.out.println("-------------------------------------------------------");
        System.out.println("Balance Checker: Even Index Sum = Odd Index Sum?");
        System.out.print("Please enter the number (as a String): ");
        
        String userInput = scanner.nextLine();
        
        if (userInput.matches("\\d+")) {
            
            boolean result = solution.isBalanced(userInput);
            
            System.out.println("\n--- Result ---");
            System.out.println("Input Number: " + userInput);
            System.out.println("Is Balanced: " + result);
            
            if (result) {
                System.out.println("Status: Congrats! The number is Balanced.");
            } else {
                System.out.println("Status: The number is Not Balanced.");
            }
            
        } else {
            System.out.println("\nError: Invalid input. Please enter digits only.");
        }

        scanner.close();
    }
}