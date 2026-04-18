import java.util.*;
public class GrasshopperOnALine{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(n%k!=0){
                System.out.println(1);
                System.out.println(n);
            }
            else{
                    System.out.println(2);
                    System.out.println((n-1) + " " + 1);
                
            }
            
        }
    }
}
