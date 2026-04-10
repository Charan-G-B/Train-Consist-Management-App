import java.util.LinkedHashSet;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 1. Create LinkedHashSet for train formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // 2. Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // 3. Attempt to add duplicate
        train.add("Sleeper"); // duplicate (will be ignored)

        // 4. Display final formation
        System.out.println("\nFinal Train Formation (in insertion order, no duplicates):");
        System.out.println(train);

        System.out.println("\nTotal bogies: " + train.size());

        System.out.println("\nProgram continues...");
    }
}