import java.util.Scanner;

public class StringSegmentCounter {

    public int countSegments(String s) {
        int count = 0;
        boolean inSegment = false;
        
        for (char c : s.toCharArray()) {
            
            if (c != ' ' && !inSegment) {
                count++;
                inSegment = true;
            } 
            else if (c == ' ') {
                inSegment = false;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        StringSegmentCounter counter = new StringSegmentCounter();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- String Segment Counter ---");
        System.out.print("Enter a string: ");
        
        String userInput = scanner.nextLine();
        
        int segmentCount = counter.countSegments(userInput);
        
        System.out.println("\nInput String: \"" + userInput + "\"");
        System.out.println("Total Segments (non-space words): " + segmentCount);
        
        scanner.close();
    }
}