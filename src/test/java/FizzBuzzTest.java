import org.junit.Test;
import wrapper.FizzBuzzInt;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    FizzBuzz newFizzBuzz;

    @Test
    public void shouldBeAny() {
        assertEquals("1", new FizzBuzz(new FizzBuzzInt(1)).whatIs().toString());
        assertEquals("Fizz", new FizzBuzz(new FizzBuzzInt(9)).whatIs().toString());
        assertEquals("Buzz", new FizzBuzz(new FizzBuzzInt(10)).whatIs().toString());
        assertEquals("FizzBuzz", new FizzBuzz(new FizzBuzzInt(15)).whatIs().toString());
        assertEquals("Fizz", new FizzBuzz(new FizzBuzzInt(13)).whatIs().toString());
        assertEquals("Buzz", new FizzBuzz(new FizzBuzzInt(59)).whatIs().toString());
    }
}
