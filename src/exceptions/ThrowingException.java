package exceptions;

public class ThrowingException {
    public static void main(String[] args) {

    }

    public static double calculatePay(double hours, double payRate) throws NegativeInputException {
        if (hours > 40) {
            throw new IllegalArgumentException("Hours must less than 40 hours");
        }
        if (hours < 0 || payRate < 0) {
            throw new NegativeInputException();
        }
        return hours + payRate;
    }
}
