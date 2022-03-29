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
        newFizzBuzzInt = new FizzBuzzInt(3);


        assertTrue(newFizzBuzzString.contains(newFizzBuzzInt));
    }

    @Test
    public void shouldHaveFive() {
        newFizzBuzzString = new FizzBuzzString("59");
        newFizzBuzzInt = new FizzBuzzInt(5);

        assertTrue(newFizzBuzzString.contains(newFizzBuzzInt));
    }

    @Test
    public void shouldBeString(){
        newFizzBuzzString = new FizzBuzzString("Hello World");

        assertEquals("Hello World", newFizzBuzzString.toString());
    }

}
