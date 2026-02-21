import java.util.*;
public class SolidersAndBananas{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int h=sc.nextInt();
        int n=sc.nextInt();
        int total=0;
        for(int i=1;i<=n;i++){
            total=total+i*c;
        }
        if(total>h)
        System.out.println(total-h);
        else
        System.out.println(0);
        