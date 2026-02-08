import java.util.*;
public class WayTooLong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] s1=new String[n];
        for(int i=0;i<n;i++){
            s1[i]=sc.next();
        }
        List<String> list=new ArrayList<>();
        for(String i :s1){
            
            if(i.length()>10){
                String s="";
                s=s+i.charAt(0)+""+(i.length()-2)+i.charAt(i.length()-1)+"";
                list.add(s);
                
            }
            else{
                list.add(i);
            }
        }
        for(String x:list){
            System.out.println(x);
        }
    }
}