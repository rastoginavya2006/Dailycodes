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


public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "ABC", 30000);
        System.out.println("Employee No: " + e1.getEmpNo());
        System.out.println("Employee Name: " + e1.getEmpName());
        System.out.println("Employee Basic Salary: " + e1.getEmpBasic());
    }
}
