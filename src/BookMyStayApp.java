import java.util.*;

public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Hotel Booking Management System");

        // Booking history (List preserves order)
        List<String> bookingHistory = new ArrayList<>();

        // Simulate confirmed bookings
        bookingHistory.add("SingleRoom-1");
        bookingHistory.add("DoubleRoom-2");
        bookingHistory.add("SuiteRoom-3");
        bookingHistory.add("SingleRoom-4");

        System.out.println("\n--- Booking History ---");

        // Display history
        for (String booking : bookingHistory) {
            System.out.println("Reservation ID: " + booking);
        }

        // Reporting
        System.out.println("\n--- Booking Report ---");

        HashMap<String, Integer> report = new HashMap<>();

        for (String booking : bookingHistory) {

            String roomType;

            if (booking.startsWith("SingleRoom")) {
                roomType = "Single Room";
            } else if (booking.startsWith("DoubleRoom")) {
                roomType = "Double Room";
            } else {
                roomType = "Suite Room";
            }

            report.put(roomType, report.getOrDefault(roomType, 0) + 1);
        }

        // Display report
        for (String type : report.keySet()) {
            System.out.println(type + " Bookings: " + report.get(type));
        }

        System.out.println("\nTotal Bookings: " + bookingHistory.size());

    }
}