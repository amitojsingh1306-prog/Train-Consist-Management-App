import java.util.HashSet;
import java.util.Set;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistUC3
 * ============================================================
 * Use Case 3: Track Unique Bogie IDs using HashSet
 *
 * @version 3.0
 */

public class TrainConsistUC3 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC3) ===\n");

        // Create HashSet for bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        System.out.println("Bogie IDs after insertion:");
        System.out.println(bogieIds);

        System.out.println("\nNote: Duplicate IDs are automatically removed.");

        System.out.println("\nApplication running...");
    }
}