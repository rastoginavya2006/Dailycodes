import java.util.*;

public class TopKFrequentElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }
        int k=sc.nextInt();
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((a,b)->
            b.getValue()-a.getValue());
            Set<Integer> topK = new HashSet<>();
            for (int i = 0; i < k && i < list.size(); i++) {
                topK.add(list.get(i).getKey());
            }
    
            // Step 3: Print elements in original array order
            Set<Integer> printed = new HashSet<>();
            for (int i = 0; i < n; i++) {
                if (topK.contains(arr[i]) && !printed.contains(arr[i])) {
                    System.out.print(arr[i] + " ");
                    printed.add(arr[i]);
                }
            }
    
            sc.close();
        }
    }
