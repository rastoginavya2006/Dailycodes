import java.util.*;
public class Tram{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int p=0;
        for(int i=0;i<n;i++){
            int e=sc.nextInt();
            int s=sc.nextInt();
            p=p-e+s;
            count=Math.max(p,count);
        }
        System.out.println(count);
        
    }
}