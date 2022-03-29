import org.junit.Test;
import wrapper.FizzBuzzInt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class FizzBuzzTest {
    FizzBuzz newFizzBuzz;

    @Test
    public void shouldBeFizz() {
        newFizzBuzz = new FizzBuzz(new FizzBuzzInt(9));

        assertEquals("Fizz", newFizzBuzz.isFizz());
    }

    @Test
    public void shouldBeBuzz() {
        newFizzBuzz = new FizzBuzz(new FizzBuzzInt(10));

        assertEquals("Buzz", newFizzBuzz.isBuzz());
    }

    @Test
    public void shouldBeFizzBuzz() {
        newFizzBuzz = new FizzBuzz(new FizzBuzzInt(15));

        assertEquals("FizzBuzz", newFizzBuzz.isFizzBuzz());
    }

    @Test
    public void shouldHaveThree() {
        newFizzBuzz = new FizzBuzz(new FizzBuzzInt(13));

        assertTrue(newFizzBuzz.contains(3));
    }

    @Test
    public void shouldHaveFive() {
        newFizzBuzz = new FizzBuzz(new FizzBuzzInt(59));

        assertTrue(newFizzBuzz.contains(5));
    }

    @Test
    public void shouldBeAny() {
        assertEquals("1", new FizzBuzz(new FizzBuzzInt(1)).whatIs());
        assertEquals("Fizz", new FizzBuzz(new FizzBuzzInt(9)).whatIs());
        assertEquals("Buzz", new FizzBuzz(new FizzBuzzInt(10)).whatIs());
        assertEquals("FizzBuzz", new FizzBuzz(new FizzBuzzInt(15)).whatIs());
        assertEquals("Fizz", new FizzBuzz(new FizzBuzzInt(13)).whatIs());
        assertEquals("Buzz", new FizzBuzz(new FizzBuzzInt(59)).whatIs());
    }
}
