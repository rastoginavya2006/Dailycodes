import java.util.*;
public class VladAndTheBestOfFive{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.next();
            int c=0;
            for(char ch:s.toCharArray()){
                if(ch=='A'){
                    c++;
                }
            }
            if(c>=3){
                System.out.println("A");
            }
            else{
                System.out.println("B");
            }
        }
    }
}
