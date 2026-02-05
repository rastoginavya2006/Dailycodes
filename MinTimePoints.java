import java.util.Scanner;

public class MinTimePoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MinTimePoints solver = new MinTimePoints();

        System.out.print("Enter the number of points: ");
        int n = scanner.nextInt();
        int[][] points = new int[n][2];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter x and y for point " + (i + 1) + ": ");
            points[i][0] = scanner.nextInt();
            points[i][1] = scanner.nextInt();
        }

        int result = solver.minTimeToVisitAllPoints(points);
        System.out.println("Minimum time to visit all points: " + result);

        scanner.close();
    }

    public int minTimeToVisitAllPoints(int[][] p) {
        int ans = 0;
        for (int i = 1; i < p.length; i++) {
            // Chebyshev Distance: max(|x2 - x1|, |y2 - y1|)
            ans += Math.max(
                Math.abs(p[i][0] - p[i - 1][0]),
                Math.abs(p[i][1] - p[i - 1][1])
            );
        }
        return ans;
    }
}