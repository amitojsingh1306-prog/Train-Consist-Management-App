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

    void display() {
        System.out.println(id + " " + type + " " + capacity);
    }
}

public class PassengerBogieUC8Test {
    public static void main(String[] args) {

        List<DataUC8> list = new ArrayList<>();

        list.add(new DataUC8("B1","Sleeper",72));
        list.add(new DataUC8("B2","AC",60));
        list.add(new DataUC8("B3","First",40));
        list.add(new DataUC8("B4","Sleeper",80));

        List<DataUC8> result = list.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        result.forEach(DataUC8::display);
    }
}