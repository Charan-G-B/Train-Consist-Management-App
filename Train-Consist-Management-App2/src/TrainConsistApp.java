import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 1. Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // 2. Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // 3. Display bogies after insertion
        System.out.println("\nPassenger Bogies after adding:");
        System.out.println(passengerBogies);

        // 4. Remove a bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // 5. Check if Sleeper exists
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie is present in the train.");
        } else {
            System.out.println("\nSleeper bogie is NOT present.");
        }

        // 6. Final list
        System.out.println("\nFinal Passenger Bogies:");
        System.out.println(passengerBogies);

        System.out.println("\nProgram continues...");
    }
}