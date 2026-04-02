import java.util.*;
public class SequenceGame{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
            int n=sc.nextInt();
            int[] b=new int[n];
            int m=n;
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
            }
            List<Integer> a=new ArrayList<>();
            a.add(b[0]);
            for(int i=1;i<n;i++){
                a.add(b[i]);
                if(b[i]<b[i-1]){
                    m++;
                    a.add(b[i]);
                }
            }
            System.out.println(m);
            for(int num :a){
                System.out.print(num+" ");
            }
            
        }
    }
}