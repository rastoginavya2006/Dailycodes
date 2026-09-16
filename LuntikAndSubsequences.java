import java.util.*;
public class LuntikAndSubsequences{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
               int z=0;
            int o=0;
           
            for(int i=0;i<n;i++){
                int val=sc.nextInt();
                if(val==0){
                    z++;
                }
                else if(val==1){
                    o++;
                }
                
            }
           
         
            System.out.println(o*(1L<<z));
            
        }
    }
    
}
