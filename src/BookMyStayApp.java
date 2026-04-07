import java.util.*;

public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Hotel Booking Management System");

        // Simulated allocated reservations (from UC6)
        List<String> reservations = new ArrayList<>();
        reservations.add("SingleRoom-1");
        reservations.add("DoubleRoom-2");

        // Add-on services mapping (Reservation → List of services)
        HashMap<String, List<String>> addOnServices = new HashMap<>();

        // Service prices
        HashMap<String, Integer> servicePrices = new HashMap<>();
        servicePrices.put("Breakfast", 200);
        servicePrices.put("WiFi", 100);
        servicePrices.put("Airport Pickup", 500);

        // Add services to reservations
        addService(addOnServices, "SingleRoom-1", "Breakfast");
        addService(addOnServices, "SingleRoom-1", "WiFi");
        addService(addOnServices, "DoubleRoom-2", "Airport Pickup");

        System.out.println("\n--- Add-On Services ---");

        // Display services and calculate cost
        for (String reservation : addOnServices.keySet()) {

            System.out.println("Reservation: " + reservation);

            List<String> services = addOnServices.get(reservation);
            int totalCost = 0;

            for (String service : services) {
                System.out.println("Service: " + service + " Cost: " + servicePrices.get(service));
                totalCost += servicePrices.get(service);
            }

            System.out.println("Total Add-On Cost: " + totalCost);
            System.out.println();
        }

    }

    // Helper method to add services
    public static void addService(HashMap<String, List<String>> map, String reservationId, String service) {

        map.putIfAbsent(reservationId, new ArrayList<>());
        map.get(reservationId).add(service);
    }
}