class DataUC12 {
    int weight;
    int limit;

    DataUC12(int weight, int limit) {
        this.weight = weight;
        this.limit = limit;
    }

    void check() {
        if(weight <= limit)
            System.out.println("Safe");
        else
            System.out.println("Overloaded");
    }
}

public class UC12_SafetyComplianceCheckForGoodsBogies {
    public static void main(String[] args) {
        DataUC12 b1 = new DataUC12(80,100);
        DataUC12 b2 = new DataUC12(120,100);

        b1.check();
        b2.check();
    }
}