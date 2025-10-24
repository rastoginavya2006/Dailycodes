import java.util.Scanner;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b; // May throw ArithmeticException
            System.out.println("Result: " + result);

            int[] arr = {10, 20, 30};
            System.out.print("Enter array index: ");
            int index = sc.nextInt();

            System.out.println("Array value at index " + index + " is: " + arr[index]); // May throw ArrayIndexOutOfBoundsException

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");
        } catch (Exception e) {
            System.out.println("Some other error occurred: " + e.getMessage());
        }
        System.out.println("Program continues normally...");
    }
}
