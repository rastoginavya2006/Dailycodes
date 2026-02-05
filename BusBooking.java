class Bus {
    int seats = 2;

    synchronized void bookSeat(String passengerName) {
        if(seats > 0) {
            System.out.println(passengerName + " booked a seat.");
            seats--;
        } else {
            System.out.println("Sorry " + passengerName + ", no seats available.");
        }
    }
}

class Passenger extends Thread {
    Bus bus;
    String passengerName;

    Passenger(Bus bus, String name){
        this.bus = bus;
        this.passengerName = name;
    }

    public void run() {
        bus.bookSeat(passengerName);
    }
}

public class BusBooking {
    public static void main(String[] args) {
        Bus bus = new Bus();

        Passenger p1 = new Passenger(bus, "Aashi");
        Passenger p2 = new Passenger(bus, "Aavya");
        Passenger p3 = new Passenger(bus, "jiya");

        p1.start();
        p2.start();
        p3.start();
    }
}
