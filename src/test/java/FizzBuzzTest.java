import org.junit.Test;
import wrapper.FizzBuzzInt;
import wrapper.FizzBuzzString;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    FizzBuzzString newFizzBuzzString;

    @Test
    public void shouldBeNumberString(){
        newFizzBuzzString = new FizzBuzz(new FizzBuzzInt(1)).whatIs();

        assertEquals("1", newFizzBuzzString.toString());
    }

    @Test
    public void shouldBeFizz(){
        newFizzBuzzString = new FizzBuzz(new FizzBuzzInt(3)).whatIs();

        assertEquals("Fizz", newFizzBuzzString.toString());
    }

    @Test
    public void shouldBeBuzz(){
        newFizzBuzzString = new FizzBuzz(new FizzBuzzInt(5)).whatIs();

        assertEquals("Buzz", newFizzBuzzString.toString());
    }

    @Test
    public void shouldBeFizzBuzz(){
        newFizzBuzzString = new FizzBuzz(new FizzBuzzInt(15)).whatIs();

        assertEquals("FizzBuzz", newFizzBuzzString.toString());
    }

    @Test
    public void shouldBeBuzzBecauseContainsThree() {
        newFizzBuzzString = new FizzBuzz(new FizzBuzzInt(13)).whatIs();

        assertEquals("Fizz", newFizzBuzzString.toString());
    }

    @Test
    public void shouldBeBuzzBecauseContainsFive() {
        newFizzBuzzString = new FizzBuzz(new FizzBuzzInt(59)).whatIs();

        assertEquals("Buzz", newFizzBuzzString.toString());
    }
}
