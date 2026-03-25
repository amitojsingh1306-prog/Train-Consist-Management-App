package src;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrainConsistUC7 {

    // Bogie class with name and capacity
    static class Bogie {
        String name;
        int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (" + capacity + " seats)";
        }
    }

    public static void main(String[] args) {
        System.out.println("=== UC7: Sort Bogies by Capacity ===");

        // Create list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        // Display unsorted bogies
        System.out.println("Before sorting:");
        bogies.forEach(System.out::println);

        // Sort bogies by capacity in descending order
        bogies.sort(Comparator.comparingInt((Bogie b) -> b.capacity).reversed());

        // Display sorted bogies
        System.out.println("\nAfter sorting by capacity (high to low):");
        bogies.forEach(System.out::println);
    }
}