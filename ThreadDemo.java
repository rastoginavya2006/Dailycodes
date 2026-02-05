class MyThread implements Runnable {
    private String name;
    MyThread(String name) {
        this.name = name;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " is running, count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted.");
            }
        }
        System.out.println(name + " has finished execution.");
    }}
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread obj1 = new MyThread("Thread-1");
        MyThread obj2 = new MyThread("Thread-2");
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        System.out.println("Main thread execution completed.");
    }
}
