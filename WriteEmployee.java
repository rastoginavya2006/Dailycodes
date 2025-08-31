import java.util.Scanner;
class Employee {
    private int empNo;
    private String empName;
    private int empBasic;

    
    public Employee(int empNo, String empName, int empBasic) {
        this.empNo = empNo;
        this.empName = empName;
        this.empBasic = empBasic;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpBasic() {
        return empBasic;
    }
}


public class WriteEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Employee Number: ");
        int no = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Basic Salary: ");
        int basic = sc.nextInt();

        Employee emp = new Employee(no, name, basic);

        
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee Number : " + emp.getEmpNo());
        System.out.println("Employee Name   : " + emp.getEmpName());
        System.out.println("Basic Salary    : " + emp.getEmpBasic());

        sc.close();
    }
}
