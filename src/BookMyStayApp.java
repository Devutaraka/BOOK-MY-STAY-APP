import java.util.*;

public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Hotel Booking Management System");

        // Inventory
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("Single Room", 2);
        inventory.put("Double Room", 1);

        // Sample booking inputs (one invalid)
        String[] bookingRequests = {"Single Room", "Suite Room", "Double Room"};

        System.out.println("\n--- Booking Validation ---");

        for (String request : bookingRequests) {

            try {
                validateBooking(request, inventory);

                // If valid
                System.out.println("Booking Valid: " + request);

            } catch (InvalidBookingException e) {

                // Handle error
                System.out.println("Error: " + e.getMessage());
            }
        }

    }

    // Validation method
    public static void validateBooking(String roomType, HashMap<String, Integer> inventory)
            throws InvalidBookingException {

        // Check if room exists
        if (!inventory.containsKey(roomType)) {
            throw new InvalidBookingException("Invalid room type: " + roomType);
        }

        // Check availability
        if (inventory.get(roomType) <= 0) {
            throw new InvalidBookingException("No availability for: " + roomType);
        }
    }
}

// Custom Exception
class InvalidBookingException extends Exception {

    public InvalidBookingException(String message) {
        super(message);
    }
}