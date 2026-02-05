import java.util.*;

public class StudentsMarks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> studentMarks = new HashMap<>();

        System.out.print("How many students'data you want to store? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Name of Student: ");
            String name = sc.nextLine();
            System.out.print("Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            
            if (studentMarks.containsKey(name)) {
                System.out.println(name + " marks updated.");
            }
            studentMarks.put(name, marks);
        }

       
        System.out.println("\nAll students and their marks:");
        studentMarks.forEach((k, v) -> System.out.println(k + ": " + v));

       
        int maxMarks = Collections.max(studentMarks.values());
        System.out.println("\nTop student(s) with marks " + maxMarks + ":");
        studentMarks.forEach((k, v) -> {
            if (v == maxMarks) System.out.println(k);
        });

   
        int minMarks = Collections.min(studentMarks.values());
        System.out.println("\nStudent(s) with minimum marks " + minMarks + ":");
        studentMarks.forEach((k, v) -> {
            if (v == minMarks) System.out.println(k);
        });

       
        double avg = studentMarks.values().stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("\nAverage marks: " + avg);

        sc.close();
    }
}
