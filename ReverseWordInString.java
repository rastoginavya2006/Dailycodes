import java.util.*;
public class ReverseWordInString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        s = s.replaceAll("\\s+", " ");
        String n="";
        String[] arr=s.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            n=n+arr[i]+" ";
        }
        System.out.println("String Before: "+s);
        System.out.println("String After: "+n);

    }
}