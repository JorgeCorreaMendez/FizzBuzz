import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void shouldBeOne() {
        FizzBuzz newFizzBuzz = new FizzBuzz(1);

        assertEquals(newFizzBuzz.getNumber(), 1);
    }

    @Test
    public void shouldBeMultipleOf2(){
        FizzBuzz newFizzBuzz = new FizzBuzz(2);

        assertEquals(newFizzBuzz.isMultipleOf2(), true);
    }
}
