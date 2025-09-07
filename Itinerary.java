//Find itinerary from tickets............

import java.util.*;
public class Itinerary {
        public static String start(HashMap<String,String> map){
            HashMap<String,String> revMap=new HashMap<>();
            for(String s: map.keySet()){
                revMap.put(map.get(s),s);
            }
            for(String s: map.keySet()){
                if(!revMap.containsKey(s))
                return s;
            }
            return null;
        }
        public static void main(String[] args) {
            HashMap<String,String> ticket=new HashMap<>();
            ticket.put("Chennai","Bengluru");
            ticket.put("Mumbai","Delhi");
            ticket.put("Goa","Chennai");
            ticket.put("Delhi","Goa");
            String start1=start(ticket);
            while(ticket.containsKey(start1)){
                System.out.print(start1+" - > ");
                start1=ticket.get(start1);

            }
            System.out.println(start1);
        }
}
