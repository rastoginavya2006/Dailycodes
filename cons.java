// public class cons {
//     cons(){
//         System.out.println("Hello");
//     }
//     public static void main(String[] args) {
//         cons c=new cons();
//     }
// }
class c2{
    private double num;
    public c2(double num){
        this.num=num;
    }
    public boolean isZero(){
        boolean result=(num==0);
        System.out.println("Zero = "+result);
        return result;
    }
    public boolean isPositive(){
        boolean result=(num>0);
        System.out.println("Positive = "+result);
        return result;
    }
    public boolean isNegative(){
        boolean result=(num<0);
        System.out.println("negative = "+result);
        return result;
    }
    public boolean iseven(){
        boolean result=(num%2==0);
        System.out.println("Even = "+result);
        return result;
    }
    public boolean isOdd(){
        boolean result=(num%2!=0);
        System.out.println("Odd = "+result);
        return result;
    }
    public boolean isPrime(){
        if(num<=1 || num!=Math.floor(num)){
            System.out.println("Prime = false");
            return false;
        }
    
    System.out.println("Prime = true");
    return true;
}
}

