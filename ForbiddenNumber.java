import java.util.*;
public class ForbiddenNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int x=sc.nextInt();
            
            if(x!=1){
                System.out.println("Yes");
                System.out.println(n);
                for(int j=0;j<n;j++){
                    System.out.print(1+" ");
                }
                System.out.println();
            }
            else{
                if(k>=2 && n%2==0){
                    System.out.println("Yes");
                    System.out.println(n/2);
                for(int j=0;j<n/2;j++){
                    System.out.print(2+" ");
                }
                System.out.println();
                }
                else if(k>=3 && n>=3){
                    System.out.println("Yes");
                    System.out.println((n-3)/2+1);
                    System.out.println(3+" ");
                for(int j=0;j<(n-3)/2;j++){
                    System.out.print(2+" ");
                }
                System.out.println();
                }
                else{
                    System.out.println("No");
                }
            }
        }
    }
}
