//Create an abstract class 'Bank' with an abstract method 'getBalance'.
//  $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA',
//   'BankB' and 'BankC' are subclasses of class 'Bank', each having a method
//    named 'getBalance'. Call this method by creating an object of each of the three classes.
abstract class Banking{
    abstract int getBalance();

}
class BankA extends Banking{
    
    @Override
    int getBalance(){
        return 67567;
    }
}
class BankB extends Banking{
   
    @Override
    int getBalance(){
        return 73939;
    }
}
class BankC extends Banking{
    
    @Override
    int getBalance(){
        return 4789;
    }
}
public class Bank{
    public static void main(String[] args) {
        Banking A=new BankA();
        Banking B=new BankB();
        Banking C=new BankC();
        System.out.println(A.getBalance());
        System.out.println(B.getBalance());
        System.out.println(C.getBalance());
    }
}