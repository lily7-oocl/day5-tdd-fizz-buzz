package tdd.fizzbuzz;

public class FizzBuzz {
    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String countOff(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return FIZZ_BUZZ;
        } else if (number % 3 == 0) {
            return FIZZ;
        } else if (number % 5 == 0) {
            return BUZZ;
        } else {
            return String.valueOf(number);
        }
    }
}
