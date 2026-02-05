import java.util.*;
class Reservation{
    String TrainName;
    int TrainNumber;

    Reservation(String TrainName,int TrainNumber){
        this.TrainName=TrainName;
        this.TrainNumber=TrainNumber;
    }
    
    @Override
    public String toString(){
        return TrainName+":"+ TrainNumber;
    }

}
public class TrainReservation {
    public static void main(String[] args) {
        Queue<Reservation> train=new LinkedList<>();
        train.add(new Reservation("Navya",12));
        train.add(new Reservation("Aavya",24));
        train.add(new Reservation("Bavya",36));
        train.add(new Reservation("Kavya",48));
        train.add(new Reservation("Savya",60));
        train.add(new Reservation("Divya",72));
        System.out.println("Before Waiting List : "+ train);
        System.out.println("Booking Confirmed for: "+ train.poll());
        System.out.println("Booking Confirmed for: "+ train.poll() );
        System.out.println("After Waiting List : "+ train);

    }
}
