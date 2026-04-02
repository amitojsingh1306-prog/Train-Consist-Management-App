public class UC14_HandleInvalidBogieCapacity {
    public static void main(String[] args) {

        int capacity = -10;

        try {
            if(capacity < 0)
                throw new Exception("Invalid Capacity");

            System.out.println("Valid Capacity");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}