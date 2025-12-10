import java.util.*;

public class PowerOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        for(int i=0;i<16;i++){
            if(Math.pow(4,i)==n){
                System.out.println("True");
                return;
            }
        }
        System.out.println("False");
    }
}