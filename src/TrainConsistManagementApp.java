import java.util.*;
import java.util.stream.Collectors;

// Custom Exception
class InvalidCoachCapacityException extends Exception {
    public InvalidCoachCapacityException(String message) {
        super(message);
    }
}

// Passenger Coach
class PassengerCoach {
    String coachId;
    String type;
    int capacity;

    public PassengerCoach(String coachId, String type, int capacity) throws InvalidCoachCapacityException {
        if (capacity <= 0) {
            throw new InvalidCoachCapacityException("Capacity must be greater than zero");
        }
        this.coachId = coachId;
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public void display() {
        System.out.println(coachId + " | " + type + " | Capacity: " + capacity);
    }
}

// Freight Wagon
class FreightWagon {
    String wagonId;
    String type;
    String cargo;

    public FreightWagon(String wagonId, String type, String cargo) {
        this.wagonId = wagonId;
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    public void display() {
        System.out.println(wagonId + " | " + type + " | Cargo: " + cargo);
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        try {
            List<PassengerCoach> passengerBogies = new ArrayList<>();
            passengerBogies.add(new PassengerCoach("P1", "Sleeper", 72));
            passengerBogies.add(new PassengerCoach("P2", "AC Chair", 50));
            passengerBogies.add(new PassengerCoach("P3", "First Class", 30));

            List<FreightWagon> goodsBogies = new ArrayList<>();
            goodsBogies.add(new FreightWagon("G1", "Cylindrical", "Petroleum"));
            goodsBogies.add(new FreightWagon("G2", "Open", "Coal"));
            goodsBogies.add(new FreightWagon("G3", "Box", "Grain"));

            System.out.println("=== Passenger Coaches ===");
            passengerBogies.forEach(PassengerCoach::display);

            System.out.println("\n=== Freight Wagons ===");
            goodsBogies.forEach(FreightWagon::display);

            // UC8 Filter
            System.out.println("\nUC8 – Filter Capacity > 60");
            passengerBogies.stream()
                    .filter(b -> b.getCapacity() > 60)
                    .forEach(PassengerCoach::display);

            // UC9 Group
            System.out.println("\nUC9 – Group by Type");
            Map<String, List<PassengerCoach>> grouped =
                    passengerBogies.stream().collect(Collectors.groupingBy(PassengerCoach::getType));
            grouped.forEach((type, list) -> System.out.println(type + " -> " + list.size()));

            // UC10 Reduce
            System.out.println("\nUC10 – Total Capacity");
            int totalCapacity = passengerBogies.stream()
                    .map(PassengerCoach::getCapacity)
                    .reduce(0, Integer::sum);
            System.out.println("Total Capacity = " + totalCapacity);

            // UC12 Safety
            System.out.println("\nUC12 – Safety Check");
            boolean isSafe = goodsBogies.stream()
                    .allMatch(b -> {
                        if (b.getType().equals("Cylindrical")) {
                            return b.getCargo().equals("Petroleum");
                        }
                        return true;
                    });
            System.out.println("Train Safety Status: " + isSafe);

            // UC13 Performance
            System.out.println("\nUC13 – Performance Comparison");

            long startLoop = System.nanoTime();
            List<PassengerCoach> loopFiltered = new ArrayList<>();
            for (PassengerCoach b : passengerBogies) {
                if (b.getCapacity() > 40) {
                    loopFiltered.add(b);
                }
            }
            long endLoop = System.nanoTime();

            long startStream = System.nanoTime();
            List<PassengerCoach> streamFiltered = passengerBogies.stream()
                    .filter(b -> b.getCapacity() > 40)
                    .collect(Collectors.toList());
            long endStream = System.nanoTime();

            System.out.println("Loop Time: " + (endLoop - startLoop));
            System.out.println("Stream Time: " + (endStream - startStream));

        } catch (InvalidCoachCapacityException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}