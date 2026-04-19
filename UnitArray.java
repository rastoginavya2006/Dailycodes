import java.util.*;
public class UnitArray{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        
        for(int i=0;i<t;i++){
            int neg=0;
            int pos=0;
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
                if(arr[j]>0){
                    pos++;
                }
                else{
                    neg++;
                }
            }
            
                int count=0;
                while(pos<neg){
                    count++;
                    neg--;
                    pos++;
                }
                if(neg%2!=0){
                    count++;
                }
                System.out.println(count);
            
            
           
            
        }
    }
}
