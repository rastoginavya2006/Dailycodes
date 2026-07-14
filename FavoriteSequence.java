import java.util.Scanner;

public class FavoriteSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            int left = 0;
            int right = n - 1;
            
           
            while (left <= right) {
                if (left == right) {
                    System.out.print(arr[left] + " ");
                } else {
                    System.out.print(arr[left] + " " + arr[right] + " ");
                }
                left++;
                right--;
            }
            System.out.println();
        }
        
        sc.close();
    }
}
