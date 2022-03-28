import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class FizzBuzzTest {

    @Test
    public void shouldBeOne() {
        FizzBuzz newFizzBuzz = new FizzBuzz(1);

        assertEquals(newFizzBuzz.getNumber(), 1);
    }

    @Test
    public void shouldBeMultipleOf3() {
        FizzBuzz newFizzBuzz = new FizzBuzz(3);

        assertTrue(newFizzBuzz.isMultipleOf(3));
    }

    @Test
    public void shouldBeMultipleOf5() {
        FizzBuzz newFizzBuzz = new FizzBuzz(5);

        assertTrue(newFizzBuzz.isMultipleOf(5));
    }

    @Test
    public void shouldBeFizz() {
        FizzBuzz newFizzBuzz = new FizzBuzz(9);

        assertEquals(newFizzBuzz.isFizz(), "Fizz");
    }

    @Test
    public void shouldBeBuzz() {
        FizzBuzz newFizzBuzz = new FizzBuzz(10);

        assertEquals(newFizzBuzz.isBuzz(), "Buzz");
    }

    @Test
    public void shouldBeFizzBuzz() {
        FizzBuzz newFizzBuzz = new FizzBuzz(15);

        assertEquals(newFizzBuzz.isFizzBuzz(), "FizzBuzz");
    }

    @Test
    public void shouldBeAny() {
        assertEquals(new FizzBuzz(1).whatIs(), "1");
        assertEquals(new FizzBuzz(9).whatIs(), "Fizz");
        assertEquals(new FizzBuzz(10).whatIs(), "Buzz");
        assertEquals(new FizzBuzz(15).whatIs(), "FizzBuzz");
    }
}
