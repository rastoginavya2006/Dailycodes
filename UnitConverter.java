import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Unit Converter ===");
        System.out.println("Choose conversion type:");
        System.out.println("1. Length (Kilometer ↔ Mile)");
        System.out.println("2. Weight (Kilogram ↔ Pound)");
        System.out.println("3. Temperature (Celsius ↔ Fahrenheit)");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();
        double input, result;

        switch (choice) {
            case 1:
                System.out.print("Enter value in kilometers: ");
                input = sc.nextDouble();
                result = input * 0.621371;
                System.out.println(input + " km = " + result + " miles");

                System.out.print("Enter value in miles: ");
                input = sc.nextDouble();
                result = input / 0.621371;
                System.out.println(input + " miles = " + result + " km");
                break;

            case 2:
                System.out.print("Enter value in kilograms: ");
                input = sc.nextDouble();
                result = input * 2.20462;
                System.out.println(input + " kg = " + result + " pounds");

                System.out.print("Enter value in pounds: ");
                input = sc.nextDouble();
                result = input / 2.20462;
                System.out.println(input + " pounds = " + result + " kg");
                break;

            case 3:
                System.out.print("Enter value in Celsius: ");
                input = sc.nextDouble();
                result = (input * 9 / 5) + 32;
                System.out.println(input + " °C = " + result + " °F");

                System.out.print("Enter value in Fahrenheit: ");
                input = sc.nextDouble();
                result = (input - 32) * 5 / 9;
                System.out.println(input + " °F = " + result + " °C");
                break;

            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }
}
