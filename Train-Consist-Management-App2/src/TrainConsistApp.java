import java.util.HashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 1. Create HashSet for bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // 2. Add bogie IDs (including duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // 3. Display unique bogie IDs
        System.out.println("\nBogie IDs in the train (duplicates removed automatically):");
        System.out.println(bogieIDs);

        System.out.println("\nTotal unique bogies: " + bogieIDs.size());

        System.out.println("\nProgram continues...");
    }
}