import java.util.ArrayList;
import java.util.List;
import java.lang.ArithmeticException;

class NullParameterException extends Exception{
    public NullParameterException(String message){
        super(message);
    }
}
class OverflowException extends Exception{
    public OverflowException(String message){
        super(message);
    }
}
class UnderflowException extends Exception{
    public UnderflowException(String message){
        super(message);
    }
}




interface ICalculator{
    double add(Double a, Double b) throws NullParameterException, OverflowException, UnderflowException;

    double divide(Double a, Double b) throws NullParameterException, OverflowException, UnderflowException;

    double average(List<Double> values) throws NullParameterException, OverflowException, UnderflowException;
}


public class Calculator implements ICalculator {

    @Override
    public double add(Double a, Double b) throws NullParameterException, OverflowException, UnderflowException {
        if (a == null || b == null) {
            throw new NullParameterException("Parameters cannot be null.");
        }

        double result = a + b;
        if (Double.isInfinite(result)) {
            if (result == Double.POSITIVE_INFINITY) {
                throw new OverflowException("Result is Double.POSITIVE_INFINITY.");
            } else if (result == Double.NEGATIVE_INFINITY) {
                throw new UnderflowException("Result is Double.NEGATIVE_INFINITY.");
            }
        }

        return result;
    }

    @Override
    public double divide(Double a, Double b) throws NullParameterException, OverflowException, UnderflowException {
        if (a == null || b == null) {
            throw new NullParameterException("Parameters cannot be null.");
        }

        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }

        double result = a / b;
        if (Double.isInfinite(result)) {
            if (result == Double.POSITIVE_INFINITY) {
                throw new OverflowException("Result is Double.POSITIVE_INFINITY.");
            } else if (result == Double.NEGATIVE_INFINITY) {
                throw new UnderflowException("Result is Double.NEGATIVE_INFINITY.");
            }
        }

        return result;
    }

    @Override
    public double average(List<Double> values) throws NullParameterException, OverflowException, UnderflowException {
        if (values == null || values.isEmpty()) {
            throw new NullParameterException("List of values cannot be null or empty.");
        }

        double sum = 0.0;
        for (Double value : values) {
            if (value == null) {
                throw new NullParameterException("List of values contains null values.");
            }
            sum = add(sum, value);
        }

        return divide(sum, (double) values.size());
    }
}







