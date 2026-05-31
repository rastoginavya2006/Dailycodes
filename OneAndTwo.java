import java.util.*;
public class OneAndTwo{
public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int t = sc.nextInt();
    for(int i=0;i<t;i++){
        int n = sc.nextInt();
        int[] arr = new int[n]; 
        int count=0;
        for(int j=0;j<n;j++){
            arr[j]=sc.nextInt();
            if(arr[j]==2){
                count++;
            }
        }
        if(count==0){
            System.out.println(1);
        }
        else{
            if(count%2!=0){
                System.out.println(-1);
            }
            else{
                int k=0,c=0;
               for(int j=0;j<n;j++){
                   if(arr[j]==2){
                       c++;
                       k=j+1;
                   }
                   if(c==count/2){
                       break;
                   }
               }
               System.out.println(k);
            }
        }
       
        
    }
}}
