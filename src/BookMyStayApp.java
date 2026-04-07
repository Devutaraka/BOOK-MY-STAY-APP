import java.util.HashMap;

public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Hotel Booking Management System");
        System.out.println("Application: Book My Stay App");
        System.out.println("Version: 1.0");

        // Centralized inventory
        HashMap<String, Integer> inventory = new HashMap<>();

        inventory.put("Single Room", 5);
        inventory.put("Double Room", 3);
        inventory.put("Suite Room", 0); // unavailable

        // Room details
        HashMap<String, Double> prices = new HashMap<>();
        prices.put("Single Room", 1000.0);
        prices.put("Double Room", 2000.0);
        prices.put("Suite Room", 5000.0);

        System.out.println("\n--- Available Rooms ---");

        // Search (read-only, no modification)
        for (String roomType : inventory.keySet()) {

            int available = inventory.get(roomType);

            // Show only available rooms
            if (available > 0) {
                System.out.println("Room Type: " + roomType);
                System.out.println("Price: " + prices.get(roomType));
                System.out.println("Available: " + available);
                System.out.println();
            }
        }

    }
}