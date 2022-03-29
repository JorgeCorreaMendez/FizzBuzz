package wrapper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FizzBuzzStringTest {
    FizzBuzzString newFizzBuzzString;
    FizzBuzzInt newFizzBuzzInt;

    @Test
    public void shouldHaveThree() {
        newFizzBuzzString = new FizzBuzzString("13");

        assertTrue(newFizzBuzzString.contains(3));
    }

    @Test
    public void shouldHaveFive() {
        newFizzBuzzString = new FizzBuzzString("59");

        assertTrue(newFizzBuzzString.contains(5));
    }

    @Test
    public void shouldBeString(){
        newFizzBuzzString = new FizzBuzzString("Hello World");

        assertEquals("Hello World", newFizzBuzzString.toString());
    }

}
