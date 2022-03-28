import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FizzBuzzTest {
    FizzBuzz newFizzBuzz;

    @Test
    public void shouldBeOne() {
        newFizzBuzz = new FizzBuzz(1);

        assertEquals(1, newFizzBuzz.getNumber());
    }

    @Test
    public void shouldBeMultipleOf3() {
        newFizzBuzz = new FizzBuzz(3);

        assertTrue(newFizzBuzz.isMultipleOf(3));
    }

    @Test
    public void shouldBeMultipleOf5() {
        newFizzBuzz = new FizzBuzz(5);

        assertTrue(newFizzBuzz.isMultipleOf(5));
    }

    @Test
    public void shouldBeFizz() {
        newFizzBuzz = new FizzBuzz(9);

        assertEquals("Fizz", newFizzBuzz.isFizz());
    }

    @Test
    public void shouldBeBuzz() {
        newFizzBuzz = new FizzBuzz(10);

        assertEquals("Buzz", newFizzBuzz.isBuzz());
    }

    @Test
    public void shouldBeFizzBuzz() {
        newFizzBuzz = new FizzBuzz(15);

        assertEquals("FizzBuzz", newFizzBuzz.isFizzBuzz());
    }

    @Test
    public void shouldHaveThree() {
        newFizzBuzz = new FizzBuzz(13);

        assertTrue(newFizzBuzz.contains(3));
    }

    @Test
    public void shouldHaveFive() {
        newFizzBuzz = new FizzBuzz(59);

        assertTrue(newFizzBuzz.contains(5));
    }

    @Test
    public void shouldBeAny() {
        assertEquals("1", new FizzBuzz(1).whatIs());
        assertEquals("Fizz", new FizzBuzz(9).whatIs());
        assertEquals("Buzz", new FizzBuzz(10).whatIs());
        assertEquals("FizzBuzz", new FizzBuzz(15).whatIs());
        assertEquals("Fizz", new FizzBuzz(13).whatIs());
        assertEquals("Buzz", new FizzBuzz(56).whatIs());
    }
}
