import java.util.Scanner;

public class CandyDistributor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CandyDistributor solver = new CandyDistributor();

        System.out.println("Enter child ratings separated by spaces:");
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");
        int[] ratings = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            ratings[i] = Integer.parseInt(parts[i]);
        }

        int totalCandies = solver.candy(ratings);
        System.out.println("Minimum total candies required: " + totalCandies);

        scanner.close();
    }

    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        
        for (int i = 0; i < n; i++) {
            candies[i] = 1;
        }

        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        int sum = 0;
        for (int i : candies) {
            sum += i;
        }
        return sum;
    }
}