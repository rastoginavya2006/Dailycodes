import java.io.*;
import java.util.*;
class Employee {
    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String toString() {
        return id + "," + name + "," + salary;
    }
    public static Employee fromString(String data) {
        String[] parts = data.split(",");
        int id = Integer.parseInt(parts[0]);
        String name = parts[1];
        double salary = Double.parseDouble(parts[2]);
        return new Employee(id, name, salary);
    }
    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}
public class WriteEmployees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        Employee emp = new Employee(id, name, salary);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("emp.txt"))) {
            writer.write(emp.toString());
            System.out.println("Employee details saved to emp.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        System.out.println("\nReading employee details from file:\n");
        try (BufferedReader reader = new BufferedReader(new FileReader("emp.txt"))) {
            String line = reader.readLine();
            if (line != null) {
                Employee empFromFile = Employee.fromString(line);
                empFromFile.display();
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }}}
