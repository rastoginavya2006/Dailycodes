import java.util.*;

public class ListMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- List Operations Menu ---");
            System.out.println("1. Add Element");
            System.out.println("2. Remove Element");
            System.out.println("3. Search Element");
            System.out.println("4. Display List");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number to add: ");
                    int num = sc.nextInt();
                    numbers.add(num);
                    System.out.println(num + " added successfully.");
                    break;

                case 2:
                    System.out.print("Enter number to remove: ");
                    int rem = sc.nextInt();
                    if (numbers.remove(Integer.valueOf(rem))) {
                        System.out.println(rem + " removed successfully.");
                    } else {
                        System.out.println(rem + " not found in list.");
                    }
                    break;

                case 3:
                    System.out.print("Enter number to search: ");
                    int search = sc.nextInt();
                    if (numbers.contains(search)) {
                        System.out.println(search + " found in list.");
                    } else {
                        System.out.println(search + " not found.");
                    }
                    break;

                case 4:
                    System.out.println("Current List: " + numbers);
                    break;

                case 5:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
