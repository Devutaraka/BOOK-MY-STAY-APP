import java.util.*;

public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Hotel Booking Management System");

        // Inventory
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("Single Room", 2);
        inventory.put("Double Room", 1);
        inventory.put("Suite Room", 1);

        // Booking Queue
        Queue<String> bookingQueue = new LinkedList<>();
        bookingQueue.add("Single Room");
        bookingQueue.add("Double Room");
        bookingQueue.add("Single Room");
        bookingQueue.add("Suite Room");

        // Store allocated room IDs
        Set<String> allocatedRooms = new HashSet<>();

        // Map room type → assigned room IDs
        HashMap<String, Set<String>> allocationMap = new HashMap<>();

        System.out.println("\n--- Processing Bookings ---");

        int idCounter = 1;

        while (!bookingQueue.isEmpty()) {

            String roomType = bookingQueue.poll();

            int available = inventory.getOrDefault(roomType, 0);

            if (available > 0) {

                // Generate unique room ID
                String roomId = roomType.replace(" ", "") + "-" + idCounter++;

                // Ensure uniqueness
                if (!allocatedRooms.contains(roomId)) {

                    allocatedRooms.add(roomId);

                    // Add to allocation map
                    allocationMap.putIfAbsent(roomType, new HashSet<>());
                    allocationMap.get(roomType).add(roomId);

                    // Update inventory
                    inventory.put(roomType, available - 1);

                    System.out.println("Booking Confirmed: " + roomType + " → Room ID: " + roomId);

                }

            } else {
                System.out.println("Booking Failed (No Availability): " + roomType);
            }
        }

        System.out.println("\n--- Final Inventory ---");
        for (String type : inventory.keySet()) {
            System.out.println(type + " Available: " + inventory.get(type));
        }

    }
}