import java.util.*;

public class MeetingFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] x = new int[3];
        for (int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
        }
        
        Arrays.sort(x);
        
        int minDistance = (x[1] - x[0]) + (x[2] - x[1]);
        
        System.out.println(minDistance);
    }
}