import java.util.*;
public class map{
    public static void main(String[] args) {
        HashMap<String,Integer> maps=new HashMap<>();
        maps.put("India",120);
        maps.put("US",30);
        maps.put("China",150);
        //System.out.println(maps);
        // if(maps.containsKey("India")){
        //     System.out.println("Contains");
        // }
        System.out.println(maps.get("China"));
        for (Map.Entry<String, Integer> en : maps.entrySet()) {
            System.out.println(en.getKey());
            System.out.println(en.getValue());
            
        }
        Set<String> keys=maps.keySet();
        for(String key: keys){
        System.out.println(key+"->"+maps.get(key));
    }}
}