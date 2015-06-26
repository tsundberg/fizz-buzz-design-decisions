package se.thinkcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

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

    // @Refactor SRP in method, creation vs. usage
    // 1. leave as is
    // 2. create field and init in constructor
    // 3. extract method

    private String fizzBuzz(int number) {
        Map<Integer, String>  translations = new HashMap<Integer, String>();

        translations.put(1, "1");
        translations.put(2, "2");
        translations.put(3, "fizz");

        return translations.get(number);
    }
}
