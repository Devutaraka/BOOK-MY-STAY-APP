import java.util.HashMap;

public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Hotel Booking Management System");
        System.out.println("Application: Book My Stay App");
        System.out.println("Version: 1.0");

        // Centralized inventory using HashMap
        HashMap<String, Integer> inventory = new HashMap<>();

        // Add room availability
        inventory.put("Single Room", 5);
        inventory.put("Double Room", 3);
        inventory.put("Suite Room", 2);

        System.out.println("\n--- Room Inventory ---");

        // Display inventory
        for (String roomType : inventory.keySet()) {
            System.out.println(roomType + " Available: " + inventory.get(roomType));
        }

        // Update availability (example)
        inventory.put("Single Room", inventory.get("Single Room") - 1);

        System.out.println("\n--- Updated Inventory ---");

        for (String roomType : inventory.keySet()) {
            System.out.println(roomType + " Available: " + inventory.get(roomType));
        }

    }
}