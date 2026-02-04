import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GroupAnagrams solver = new GroupAnagrams();

        System.out.println("Enter words separated by spaces:");
        String input = scanner.nextLine();
        String[] strs = input.split("\\s+");

        List<List<String>> result = solver.groupAnagrams(strs);

        System.out.println("\nGrouped Anagrams:");
        for (List<String> group : result) {
            System.out.println(group);
        }

        scanner.close();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        
        // Map to store the sorted string as key and the list of anagrams as value
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // Convert string to char array and sort it
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);

            // If key is not in map, create a new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            
            // Add original string to the corresponding group
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}