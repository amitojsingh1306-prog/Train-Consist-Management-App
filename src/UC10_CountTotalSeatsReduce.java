import java.util.*;

class DataUC10 {
    int seats;

    DataUC10(int seats) {
        this.seats = seats;
    }

    int getSeats() {
        return seats;
    }
}

public class UC10_CountTotalSeatsReduce {
    public static void main(String[] args) {

        List<DataUC10> list = new ArrayList<>();
        list.add(new DataUC10(50));
        list.add(new DataUC10(60));
        list.add(new DataUC10(40));

        int total = list.stream()
                .map(DataUC10::getSeats)
                .reduce(0, Integer::sum);

        System.out.println("Total Seats = " + total);
    }
}