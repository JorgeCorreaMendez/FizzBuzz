package wrapper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
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

    @Test
    public void shouldBeStringNumber(){
        newFizzBuzzInt = new FizzBuzzInt(2);

        assertEquals("2", newFizzBuzzInt.toString());
    }
}
