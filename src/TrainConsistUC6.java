import java.util.HashMap;
import java.util.Map;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistUC6
 * ============================================================
 * Use Case 6: Map Bogie to Capacity using HashMap
 *
 * @version 6.0
 */

public class TrainConsistUC6 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC6) ===\n");

        // Create HashMap for bogie capacity
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Insert bogie-capacity pairs
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // Display bogie capacities
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        System.out.println("\nApplication running...");
    }
}