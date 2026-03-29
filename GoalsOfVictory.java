import java.util.*;
public class GoalsOfVictory{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int sum=0;
        for(int i=0;i<t;i++){
            sum=0;
            int n=sc.nextInt();
            for(int j=0;j<n-1;j++){
                int s=sc.nextInt();
                sum+=s;
            }
            System.out.println(sum*(-1));
        }
        
    }
}