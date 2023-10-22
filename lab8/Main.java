import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();

        try {
            Double result1 =calculator.add(10.0, 5.0);
            System.out.println("Addition result: " + result1);

            Double result2 = calculator.divide(10.0, 2.0);
            System.out.println("Division result: " + result2);

            List<Double> values = new ArrayList<>();
            values.add(10.0);
            values.add(20.0);
            values.add(30.0);
            Double result3 = calculator.average(values);
            System.out.println("Average result: " + result3);
        } catch (NullParameterException | OverflowException | UnderflowException e) {
            // Handle exceptions here
            System.err.println("Exception: " + e.getMessage());
        }
    }
}

