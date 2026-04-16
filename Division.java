import java.util.*;
public class Division{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            if(n>=1900){
                System.out.println("Division 1");
            }
            else if(n>=1600 && n<=1899){
                System.out.println("Division 2");
            }
            else if(n>=1400 && n<=1599){
                System.out.println("Division 3");
            }
            else{
                System.out.println("Division 4");
            }
        }
    }
}
