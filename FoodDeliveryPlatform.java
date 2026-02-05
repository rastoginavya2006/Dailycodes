class Order extends Thread {
    private String customerName;
    private String foodItem;
    public Order(String customerName, String foodItem) {
        this.customerName = customerName;
        this.foodItem = foodItem;
    }
    @Override
    public void run() {
        System.out.println(customerName + " placed an order for " + foodItem);
        try {
            // Simulate time to prepare food
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Order ready for " + customerName + " (" + foodItem + ")");
    }}
public class FoodDeliveryPlatform {
    public static void main(String[] args) {
        System.out.println("=== Online Food Delivery Platform ===");
        Order order1 = new Order("Aarav", "Pizza");
        Order order2 = new Order("Diya", "Burger");
        Order order3 = new Order("Rohan", "Pasta");
        Order order4 = new Order("Meera", "Sandwich");
        order1.start();
        order2.start();
        order3.start();
        order4.start();
        System.out.println("Main system is free to take new orders...");
    }
}
