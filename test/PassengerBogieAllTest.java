import java.util.*;
import java.util.stream.Collectors;

class DataUC8 {
    String id;
    String type;
    int capacity;

    DataUC8(String id, String type, int capacity) {
        this.id = id;
        this.type = type;
        this.capacity = capacity;
    }

    int getCapacity() {
        return capacity;
    }

    String getId() {
        return id;
    }

    void display() {
        System.out.println(id + " " + type + " " + capacity);
    }
}

public class PassengerBogieUC8Test {

    public static void main(String[] args) {

        List<DataUC8> list = new ArrayList<>();

        // Initial bogies
        list.add(new DataUC8("B1","Sleeper",72));
        list.add(new DataUC8("B2","AC",60));
        list.add(new DataUC8("B3","First",40));
        list.add(new DataUC8("B4","Sleeper",80));

        System.out.println("=== UC8: Bogies with capacity > 60 ===");
        List<DataUC8> uc8 = list.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
        uc8.forEach(DataUC8::display);

        System.out.println("\n=== UC9: Add a new bogie ===");
        DataUC8 newBogie = new DataUC8("B5", "AC", 65);
        list.add(newBogie);
        list.forEach(DataUC8::display);

        System.out.println("\n=== UC10: Remove bogie B2 ===");
        list.removeIf(b -> b.getId().equals("B2"));
        list.forEach(DataUC8::display);

        System.out.println("\n=== UC11: Display all bogies ===");
        list.forEach(DataUC8::display);

        System.out.println("\n=== UC12: Check if any bogie is full (capacity >= 80) ===");
        boolean fullBogie = list.stream().anyMatch(b -> b.getCapacity() >= 80);
        System.out.println("Is there a full bogie? " + fullBogie);

        System.out.println("\n=== UC13: Total capacity of all bogies ===");
        int totalCapacity = list.stream().mapToInt(DataUC8::getCapacity).sum();
        System.out.println("Total capacity: " + totalCapacity);

        System.out.println("\n=== UC14: Clear all bogies ===");
        list.clear();
        System.out.println("Bogie list size after clearing: " + list.size());
    }
}