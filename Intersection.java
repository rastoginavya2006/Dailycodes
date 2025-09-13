// Intersection of two set
import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        HashSet<Integer> set=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("How many elements you want to enter in set1");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int c=sc.nextInt();
            set1.add(c);
        }
        System.out.println("How many elements you want to enter in set2");
        int m=sc.nextInt();
        for(int i=0;i<m;i++){
            int d=sc.nextInt();
            set2.add(d);
        }
        System.out.println(set1);
        System.out.println(set2);
        for(int b: set1){
            if(set2.contains(b)){
                set.add(b);
            }
        }
        System.out.println(set);

    }
}
