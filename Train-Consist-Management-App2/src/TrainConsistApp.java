import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        // 1. Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 2. Initialize Train Consist (empty list)
        List<String> trainConsist = new ArrayList<>();

        // 3. Display initial bogie count
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // 4. Program continues...
        System.out.println("Program ready for next operations...");
    }
}
