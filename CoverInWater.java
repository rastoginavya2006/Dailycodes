import java.util.*;
public class CoverInWater{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
        int l=sc.nextInt();
        sc.nextLine();
        String s=sc.next();
        int count=0;
        int cons=0;
        int max=0;
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='.'){
                count++;
                cons++;
                max=Math.max(max,cons);
                
            }
            else{
                cons=0;
            }
        }
        if(max>=3){
            System.out.println(2);
        }
        else if(count==0){
            System.out.println(0);
        }
        else{
            System.out.println(count);
        }
        }
    }
    
}
