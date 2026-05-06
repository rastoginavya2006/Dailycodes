import java.util.*;
public class ServalAndMocha{
    public static int findHCF(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findHCF(b, a % b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n =sc.nextInt();
            int[] arr =new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
           boolean found=false;
           for(int k=0;k<n;k++){
               for(int j=k+1;j<n;j++){
                   if(findHCF(arr[k],arr[j])<=2){
                       found=true;
                       break;
                   }
               }
               if(found) break;
           }
            if(found){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
