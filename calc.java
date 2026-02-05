// Method OverLoading
class Calculator{
    void add(int a ,int b){
        System.out.println(a+b);
    }
    void add(int a){
        System.out.println(a+a);
    }
}
public class calc {
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        c1.add(2,3);
        c1.add(5);
    }
}
//Method OverRiding
