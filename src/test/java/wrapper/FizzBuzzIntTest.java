package wrapper;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FizzBuzzIntTest {
    FizzBuzzInt newFizzBuzzInt;

    @Test
    public void shouldBeMultipleOf3() {
        newFizzBuzzInt = new FizzBuzzInt(3);

        assertTrue(newFizzBuzzInt.isMultipleOf(3));
    }

    @Test
    public void shouldBeMultipleOf5() {
        newFizzBuzzInt = new FizzBuzzInt(5);

        assertTrue(newFizzBuzzInt.isMultipleOf(5));
    }
}
