import java.util.Scanner;

public class FoodForAnimals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            
            long neededDogs = Math.max(0, x - a);
            long neededCats = Math.max(0, y - b);
            
            if (neededDogs + neededCats <= c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}
