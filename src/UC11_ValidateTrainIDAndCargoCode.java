public class UC11_ValidateTrainIDAndCargoCode {
    public static void main(String[] args) {

        String trainID = "TR123";

        if(trainID.matches("TR\\d{3}"))
            System.out.println("Valid Train ID");
        else
            System.out.println("Invalid Train ID");
    }
}