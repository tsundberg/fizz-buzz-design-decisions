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
        // now what do we do?
        // 1. return "1";
        // 2. return Integer.toString(number);
        // 3. do not see 3rd option. no real options here. maybe because first fake step.
    }

    private String fizzBuzz(int number) {
        return null;
    }
}
