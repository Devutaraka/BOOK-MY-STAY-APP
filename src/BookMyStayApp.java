import java.util.*;

public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Hotel Booking Management System");

        // Inventory
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("Single Room", 1);
        inventory.put("Double Room", 1);

        // Booking history
        List<String> bookingHistory = new ArrayList<>();
        bookingHistory.add("SingleRoom-1");
        bookingHistory.add("DoubleRoom-2");

        // Stack for rollback (LIFO)
        Stack<String> cancellationStack = new Stack<>();

        System.out.println("\n--- Before Cancellation ---");
        displayInventory(inventory);

        // Cancel a booking
        String cancelRequest = "DoubleRoom-2";

        System.out.println("\nCancelling: " + cancelRequest);

        if (bookingHistory.contains(cancelRequest)) {

            // Push to stack (rollback tracking)
            cancellationStack.push(cancelRequest);

            // Remove from booking history
            bookingHistory.remove(cancelRequest);

            // Identify room type
            String roomType;
            if (cancelRequest.startsWith("SingleRoom")) {
                roomType = "Single Room";
            } else {
                roomType = "Double Room";
            }

            // Restore inventory
            inventory.put(roomType, inventory.get(roomType) + 1);

            System.out.println("Cancellation Successful: " + cancelRequest);

        } else {
            System.out.println("Invalid Cancellation Request");
        }

        System.out.println("\n--- After Cancellation ---");
        displayInventory(inventory);

        System.out.println("\nRollback Stack:");
        for (String id : cancellationStack) {
            System.out.println(id);
        }
    }

    // Helper method
    public static void displayInventory(HashMap<String, Integer> inventory) {
        for (String type : inventory.keySet()) {
            System.out.println(type + " Available: " + inventory.get(type));
        }
    }
}