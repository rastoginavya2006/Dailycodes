import java.util.*;

public class DidNotGoToPrint{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int  t= sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            String s = sc.next();
            boolean[] inList = new boolean[n];
            List<Integer> rem = new ArrayList<>();
            Stack<Integer> st = new Stack<>();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    st.push(i);
                }
                else if(s.charAt(i)=='2'){
                    if(!st.isEmpty())
                    inList[st.pop()] = true;
                    else{
                        inList[i]=true;
                    }
                }
                else{
                    inList[i] = true;
                }
            }
            for(int i=0;i<s.length();i++){
                if(!inList[i]){
                    rem.add(i+1);
                }
            }
            System.out.println(rem.size());
            for(int i=0;i<rem.size();i++){
                System.out.print(rem.get(i)+" ");
            }
            System.out.println();
        }



    }
}
