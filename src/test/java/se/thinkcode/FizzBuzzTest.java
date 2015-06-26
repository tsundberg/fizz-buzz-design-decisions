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

    // @Refactor
    // 1. ""+number or Integer.toString
    // 2. Map
    // 3. no idea

    private String fizzBuzz(int number) {
        if (number == 1){
            return "1";
        }

        if (number == 2){
            return "2";
        }

        return null;
    }
}
