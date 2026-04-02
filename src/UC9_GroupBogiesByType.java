import java.util.*;
import java.util.stream.Collectors;

class DataUC9 {
    String id;
    String type;

    DataUC9(String id, String type) {
        this.id = id;
        this.type = type;
    }

    String getType() {
        return type;
    }
}

public class UC9_GroupBogiesByType {
    public static void main(String[] args) {

        List<DataUC9> list = new ArrayList<>();

        list.add(new DataUC9("B1","Sleeper"));
        list.add(new DataUC9("B2","AC"));
        list.add(new DataUC9("B3","Sleeper"));
        list.add(new DataUC9("B4","AC"));

        Map<String, List<DataUC9>> grouped =
                list.stream().collect(Collectors.groupingBy(DataUC9::getType));

        System.out.println(grouped);
    }
}