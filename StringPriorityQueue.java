import java.util.*;

public class StringPriorityQueue {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "pear", "grape", "mango", "pineapple", "fig", "orange");

        PriorityQueue<String> shortestPQ = new PriorityQueue<>(
                (a, b) -> (a.length() == b.length()) ? a.compareTo(b) : Integer.compare(a.length(), b.length())
        );

        PriorityQueue<String> longestPQ = new PriorityQueue<>(
                (a, b) -> (b.length() == a.length()) ? a.compareTo(b) : Integer.compare(b.length(), a.length())
        );

        shortestPQ.addAll(strings);
        longestPQ.addAll(strings);

        String shortest = shortestPQ.peek();
        String longest = longestPQ.peek();

        Set<String> uniqueSet = new HashSet<>(strings);
        PriorityQueue<String> topShortestPQ = new PriorityQueue<>(
                (a, b) -> (a.length() == b.length()) ? a.compareTo(b) : Integer.compare(a.length(), b.length())
        );
        topShortestPQ.addAll(uniqueSet);

        List<String> top3 = new ArrayList<>();
        for (int i = 0; i < 3 && !topShortestPQ.isEmpty(); i++) {
            top3.add(topShortestPQ.poll());
        }

        System.out.println("Shortest String: " + shortest);
        System.out.println("Longest String: " + longest);
        System.out.println("Top 3 Shortest Unique Strings: " + top3);
    }
}
