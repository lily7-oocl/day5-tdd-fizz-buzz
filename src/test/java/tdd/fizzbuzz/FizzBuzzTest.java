package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_normal_number_string_when_input_normal_number() {
        String expectResult = "1";
        //Given
        int inputNumber = 1;
        //When
        String result = new FizzBuzz().countOff(inputNumber);
        //Then
        assertEquals(expectResult,result);
    }
    @Test
    public void should_return_Fizz_when_input_number_that_is_multiple_of_3() {
        String expectResult = FizzBuzz.FIZZ;
        //Given
        int inputNumber = 3;
        //When
        String result = new FizzBuzz().countOff(inputNumber);
        //Then
        assertEquals(expectResult,result);
    }
    @Test
    public void should_return_Buzz_when_input_number_that_is_multiple_of_5() {
        String expectResult = FizzBuzz.BUZZ;
        //Given
        int inputNumber = 5;
        //When
        String result = new FizzBuzz().countOff(inputNumber);
        //Then
        assertEquals(expectResult,result);
    }
    @Test
    public void should_return_FizzBuzz_when_input_number_that_is_multiple_of_15() {
        String expectResult = FizzBuzz.FIZZ_BUZZ;
        //Given
        int inputNumber = 15;
        //When
        String result = new FizzBuzz().countOff(inputNumber);
        //Then
        assertEquals(expectResult,result);
    }

}
