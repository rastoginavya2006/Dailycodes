import java.util.*;
public class ComparisonString{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            String s = sc.next();
            int curr=1;
            int max=1;
            
            for(int i=1;i<n;i++){
                if(s.charAt(i)==s.charAt(i-1)){
                    curr++;
                }
                else{
                    curr=1;
                    
                }
                max=Math.max(curr,max);
            }
            
            System.out.println(max+1);
            
           
            
        }
    }
}
