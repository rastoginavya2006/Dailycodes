//Union of Two Arrays
import java.util.*;   
public class union {
    public static int unionOfArray(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        for(int n:arr1){
            set.add(n);
        }
        for(int n:arr2){
            set.add(n);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,6,2,9,4};
        System.out.println(unionOfArray(arr1, arr2));
    }
}
