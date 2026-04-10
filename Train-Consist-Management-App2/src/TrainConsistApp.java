import java.util.LinkedList;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 1. Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // 2. Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(train);

        // 3. Insert Pantry Car at position 2
        train.add(2, "Pantry");

        System.out.println("\nAfter adding Pantry at position 2:");
        System.out.println(train);

        // 4. Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter removing first and last bogies:");
        System.out.println(train);

        System.out.println("\nFinal Train Consist:");
        System.out.println(train);

        System.out.println("\nProgram continues...");
    }
}