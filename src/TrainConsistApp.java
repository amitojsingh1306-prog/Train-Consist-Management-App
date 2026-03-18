import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistApp
 * ============================================================
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Description:
 * This program initializes an empty train consist
 * and displays the initial bogie count.
 *
 * @version 1.0
 */

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===\n");

        // Initialize empty train consist
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Train consist initialized.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        System.out.println("\nApplication running...");
    }
}