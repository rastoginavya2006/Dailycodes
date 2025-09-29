import java.util.Scanner;

public class ConvertDateToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date in yyyy-mm-dd format: ");
        String date = sc.nextLine();

        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        String yearBinary = Integer.toBinaryString(year);
        String monthBinary = Integer.toBinaryString(month);
        String dayBinary = Integer.toBinaryString(day);

        String binaryDate = yearBinary + "-" + monthBinary + "-" + dayBinary;

        System.out.println(binaryDate);

        sc.close();
    }
}
