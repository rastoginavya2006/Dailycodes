abstract class Turn{
    abstract void turnOn();
    abstract void turnOff();
}
class TVRemote extends Turn{
    void turnOn(){
        System.out.println("TV is turned ON.");
    }
    void turnOff(){
        System.out.println("TV is turned OFF.");
    }
}
public class Abstract{
    public static void main(String[] args) {
        Turn remote =new TVRemote();
        remote.turnOn();
        remote.turnOff();
    }
}