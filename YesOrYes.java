import java.util.*;
public class YesOrYes{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String s=sc.next().toLowerCase();
            if(s.equals("yes")){
                System.out.println("YES");
            }
            else{
                System.out.println("No");
            }
            
        }
    }
}