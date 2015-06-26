package se.thinkcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class FizzBuzzTest {

    @Test
    public void verify_infra_structure() {
        assertTrue(true);
    }

    @Test
    public void should_return_one_for_one() {
        assertThat(fizzBuzz(1), is("1"));
    }

    @Test
    public void should_return_two_for_two() {
        assertThat(fizzBuzz(2), is("2"));
    }

    @Test
    public void should_return_fizz_for_three() {
        assertThat(fizzBuzz(3), is("fizz"));
    }

    // Refactor duplication of fizz constant
    // 1. ignore now
    // 2. create constant
    // 3. create field for class to be extracted (in constructor)

    private String fizzBuzz(int number) {
        if (number == 3) {
            return "fizz";
        }
        return Integer.toString(number);
    }
}
