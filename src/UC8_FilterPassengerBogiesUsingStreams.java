import java.util.*;
import java.util.stream.Collectors;

class PassengerBogieUC8 {
    String bogieId;
    String type;
    int capacity;

    public PassengerBogieUC8(String bogieId, String type, int capacity) {
        this.bogieId = bogieId;
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void display() {
        System.out.println(bogieId + " | " + type + " | Capacity: " + capacity);
    }
}

public class UC8_FilterPassengerBogiesUsingStreams {

    public static void main(String[] args) {

        List<PassengerBogieUC8> bogieList = new ArrayList<>();

        bogieList.add(new PassengerBogieUC8("B1", "Sleeper", 72));
        bogieList.add(new PassengerBogieUC8("B2", "AC Chair", 60));
        bogieList.add(new PassengerBogieUC8("B3", "First Class", 40));
        bogieList.add(new PassengerBogieUC8("B4", "Sleeper", 80));

        System.out.println("All Bogies:");
        bogieList.forEach(PassengerBogieUC8::display);

        List<PassengerBogieUC8> filteredBogies = bogieList.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filteredBogies.forEach(PassengerBogieUC8::display);
    }
}
