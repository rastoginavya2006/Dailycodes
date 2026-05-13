import java.util.*;

public class TeamOlympiad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        List<Integer> programmers = new ArrayList<>();
        List<Integer> mathematicians = new ArrayList<>();
        List<Integer> athletes = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            int skill = sc.nextInt();
            if (skill == 1) programmers.add(i);
            else if (skill == 2) mathematicians.add(i);
            else if (skill == 3) athletes.add(i);
        }
        
        int w = Math.min(programmers.size(), Math.min(mathematicians.size(), athletes.size()));
        
        System.out.println(w);
        
        for (int i = 0; i < w; i++) {
            System.out.println(programmers.get(i) + " " + 
                               mathematicians.get(i) + " " + 
                               athletes.get(i));
        }
        
        sc.close();
    }
}
