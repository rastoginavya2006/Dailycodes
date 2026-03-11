import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int maxVal = 0;
        int minVal = 101;
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            if (h > maxVal) {
                maxVal = h;
                maxIndex = i;
            }
            if (h <= minVal) {
                minVal = h;
                minIndex = i;
            }
        }

        int ans = maxIndex + (n - 1 - minIndex);
        if (maxIndex > minIndex) {
            ans--;
        }

        System.out.println(ans);
        sc.close();
    }
}