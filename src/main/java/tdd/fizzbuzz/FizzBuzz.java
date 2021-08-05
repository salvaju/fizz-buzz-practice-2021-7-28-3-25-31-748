package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String countOff(int orderNumber) {

        if (orderNumber % 3 == 0) {
            return FIZZ;
        } else if (orderNumber % 5 == 0) {
            return BUZZ;
        } else if (orderNumber % 7 == 0) {
            return "Whizz";
        }

        return String.valueOf(orderNumber);
    }
}
