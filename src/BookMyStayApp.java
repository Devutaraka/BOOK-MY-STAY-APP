import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Hotel Booking Management System");
        System.out.println("Application: Book My Stay App");
        System.out.println("Version: 1.0");

        // Inventory (same as before)
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("Single Room", 5);
        inventory.put("Double Room", 3);
        inventory.put("Suite Room", 2);

        // Booking request queue (FIFO)
        Queue<String> bookingQueue = new LinkedList<>();

        // Add booking requests
        bookingQueue.add("Request 1: Single Room");
        bookingQueue.add("Request 2: Double Room");
        bookingQueue.add("Request 3: Suite Room");
        bookingQueue.add("Request 4: Single Room");

        System.out.println("\n--- Booking Requests (FIFO Order) ---");

        // Display queue (no removal, no allocation)
        for (String request : bookingQueue) {
            System.out.println(request);
        }

        System.out.println("\nTotal Requests: " + bookingQueue.size());

    }
}