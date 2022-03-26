import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class FizzBuzzTest {

    @Test
    public void shouldBeArray() {
        FizzBuzz newFizzBuzz = new FizzBuzz(100);

        assertArrayEquals(newFizzBuzz.getNumbers(), new int[100]);
    }

    @Test
    public void shouldBeMultipleOf3(){
        assertEquals(FizzBuzz.isMultipleOf3(3), true);
    }

    @Test
    public void shouldBeMultipleOf5(){
        assertEquals(FizzBuzz.isMultipleOf5(5), true);
    }

    @Test
    public void shouldBeFizz(){
        assertEquals(FizzBuzz.isFizz(9), "Fizz");
    }

    @Test
    public void shouldBeBuzz(){
        assertEquals(FizzBuzz.isBuzz(10), "Buzz");
    }

    @Test
    public void shouldBeFizzBuzz(){
        assertEquals(FizzBuzz.isFizzBuzz(15), "FizzBuzz");
    }
}
