package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {

    @Test
    void should_return_order_number_when_count_off_given_normal_case_order_number() {
        //given
        int orderNumber = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.countOff(orderNumber);

        //then
        assertThat(result).isEqualTo("1");
    }

    @Test
    void should_return_Fizz_when_count_off_given_is_a_number_multiple_of_3() {
        //given
        int orderNumber = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.countOff(orderNumber);

        //then
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void should_return_Buzz_when_count_off_given_is_a_number_multiple_of_5() {
        //given
        int orderNumber = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.countOff(orderNumber);

        //then
        assertThat(result).isEqualTo("Buzz");
    }
}
