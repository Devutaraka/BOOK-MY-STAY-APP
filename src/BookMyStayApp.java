import java.util.*;

public class BookMyStayApp {

    // Shared inventory
    static HashMap<String, Integer> inventory = new HashMap<>();

    public static void main(String[] args) {

        System.out.println("Welcome to the Hotel Booking Management System");

        // Initialize inventory
        inventory.put("Single Room", 2);

        // Create multiple threads (simulating users)
        Thread t1 = new Thread(() -> bookRoom("User1", "Single Room"));
        Thread t2 = new Thread(() -> bookRoom("User2", "Single Room"));
        Thread t3 = new Thread(() -> bookRoom("User3", "Single Room"));

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }

    // Synchronized booking method (critical section)
    public static synchronized void bookRoom(String user, String roomType) {

        int available = inventory.getOrDefault(roomType, 0);

        if (available > 0) {

            System.out.println(user + " booking " + roomType);

            // Simulate delay (to show concurrency effect)
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Error");
            }

            inventory.put(roomType, available - 1);

            System.out.println(user + " booking CONFIRMED");

        } else {
            System.out.println(user + " booking FAILED (No Availability)");
        }
    }
}