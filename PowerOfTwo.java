import java.util.*;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        for(int i=0;i<31;i++){
            if(Math.pow(2,i)==n){
                System.out.println("True");
                return;
            }
        }
        System.out.println("False");
    }
}