import java.util.*;
public class GeorgeAndAccomodation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            int p=sc.nextInt();
            int c=sc.nextInt();
            if(p<c){
                count++;
            }
        }
        System.out.println(count);
    }
}