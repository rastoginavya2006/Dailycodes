import java.util.*;
public class MakeItDivisibleBy25{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] targets ={"00","25","50","75"};
        while(t-- >0){
            String s = sc.next();
            int min=Integer.MAX_VALUE;
            for(String x:targets){
                int curr = find(s,x);
                min=Math.min(min,curr);
            }
            System.out.println(min);
        }
    }
    public static int find(String s , String x){
        int len = s.length();
        int ind=-1;
        for(int i= len-1;i>=0;i--){
            if(s.charAt(i)==x.charAt(1)){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            return Integer.MAX_VALUE;
        }
        for(int i=ind-1;i>=0;i--){
            if(s.charAt(i)==x.charAt(0)){
                return len-i-2;
            }
        }
        return Integer.MAX_VALUE;
    }
}
