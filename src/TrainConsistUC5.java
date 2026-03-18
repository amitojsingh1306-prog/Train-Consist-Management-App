import java.util.LinkedHashSet;
import java.util.Set;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistUC5
 * ============================================================
 * Use Case 5: Preserve Insertion Order using LinkedHashSet
 *
 * @version 5.0
 */

public class TrainConsistUC5 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC5) ===\n");

        // Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Add duplicate
        trainFormation.add("Sleeper"); // will be ignored

        // Display formation
        System.out.println("Final Train Formation:");
        System.out.println(trainFormation);

        System.out.println("\nNote: Duplicates are removed, order is preserved.");
    }
}