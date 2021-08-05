package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";

    public String countOff(int orderNumber) {

        if (orderNumber % 3 == 0) {
            return FIZZ;
        } else if (orderNumber % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(orderNumber);
    }
}
