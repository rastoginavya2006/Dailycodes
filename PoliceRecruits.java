import java.util.*;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        int availableOfficers = 0;
        int untreatedCrimes = 0;
        
        for (int i = 0; i < n; i++) {
            int event = sc.nextInt();
            
            if (event == -1) {
                if (availableOfficers > 0) {
                    availableOfficers--; 
                } else {
                    untreatedCrimes++; 
                }
            } else {
                availableOfficers += event;
            }
        }
        
        System.out.println(untreatedCrimes);
        sc.close();
    }
}
