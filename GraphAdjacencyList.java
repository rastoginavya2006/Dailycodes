import java.util.*;

public class GraphAdjacencyList {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number of vertices: ");
    int V=sc.nextInt();
    System.out.println("Enter number of operations: ");
    int Q=sc.nextInt();
    
    ArrayList<TreeSet<Integer>> adj=new ArrayList<>(V);
    for(int i=0;i<V;i++){
        adj.add(new TreeSet<>());
    }
    StringBuilder output =new StringBuilder();
    for(int i=0;i<Q;i++){
        String op=sc.next();
        if(op.equals("ADD")){
            int u=sc.nextInt();
            int v=sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        else if(op.equals("DEL")){
            int u=sc.nextInt();
            int v=sc.nextInt();
            adj.get(u).remove(v);
            adj.get(v).remove(u);
        }
        else if(op.equals("NEIGHBORS")){
            int u=sc.nextInt();
            
            TreeSet<Integer> neighbor=adj.get(u);
            if(neighbor.isEmpty()){
                output.append("-1").append("\n");
            }
            else{
                for(int x:neighbor){
                    output.append(x).append(" ");
                }
                output.append("\n");
            }
        }
    }
    for(int i=0;i<V;i++){
        output.append(i).append(":");
        TreeSet<Integer> neighbor=adj.get(i);
        if(neighbor.isEmpty()){
            output.append(" ");
        }
        else{
            for(int x: neighbor){
                output.append(x).append(" ");
            }
            output.append("\n");
        }
    }
    System.out.print(output.toString());

}
}