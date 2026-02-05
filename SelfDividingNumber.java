import java.util.*;
public class SelfDividingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the left limit: ");
        int left=sc.nextInt();
        System.out.println("Enter the right limit: " );
        int right=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int num=i;
            while(num>0){
                int r=num%10;
                if(r==0 || i%r!=0){
                    break;
                }
                else
                {
                    num=num/10;
                }
            }
            if(num==0){
                list.add(i);
            }
        }
        System.out.println("The Self Dividing Numbers are: "+ list);

    }
}
