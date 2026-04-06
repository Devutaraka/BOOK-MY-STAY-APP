public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Hotel Booking Management System");
        System.out.println("Application: Book My Stay App");
        System.out.println("Version: 1.0");

        // Room details (simple variables)
        String singleType = "Single Room";
        int singleBeds = 1;
        double singlePrice = 1000;
        int singleAvailable = 5;

        String doubleType = "Double Room";
        int doubleBeds = 2;
        double doublePrice = 2000;
        int doubleAvailable = 3;

        String suiteType = "Suite Room";
        int suiteBeds = 3;
        double suitePrice = 5000;
        int suiteAvailable = 2;

        System.out.println("\n--- Room Details ---");

        System.out.println("Room Type: " + singleType);
        System.out.println("Beds: " + singleBeds);
        System.out.println("Price: " + singlePrice);
        System.out.println("Available: " + singleAvailable);

        System.out.println();

        System.out.println("Room Type: " + doubleType);
        System.out.println("Beds: " + doubleBeds);
        System.out.println("Price: " + doublePrice);
        System.out.println("Available: " + doubleAvailable);

        System.out.println();

        System.out.println("Room Type: " + suiteType);
        System.out.println("Beds: " + suiteBeds);
        System.out.println("Price: " + suitePrice);
        System.out.println("Available: " + suiteAvailable);

    }
}