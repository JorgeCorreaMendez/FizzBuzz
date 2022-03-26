import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void shouldBeOne() {
        FizzBuzz newFizzBuzz = new FizzBuzz(1);

        assertEquals(newFizzBuzz.getNumber(), 1);
    }

    @Test
    public void shouldBeMultipleOf3(){
        FizzBuzz newFizzBuzz = new FizzBuzz(3);

        assertEquals(newFizzBuzz.isMultipleOf3(), true);
    }

    @Test
    public void shouldBeMultipleOf5(){
        FizzBuzz newFizzBuzz = new FizzBuzz(5);

        assertEquals(newFizzBuzz.isMultipleOf5(), true);
    }

    @Test
    public void shouldBeFizz(){
        FizzBuzz newFizzBuzz = new FizzBuzz(9);

        assertEquals(newFizzBuzz.isFizz(), "Fizz");
    }

    @Test
    public void shouldBeBuzz(){
        FizzBuzz newFizzBuzz = new FizzBuzz(10);

        assertEquals(newFizzBuzz.isBuzz(), "Buzz");
    }

    @Test
    public void shouldBeFizzBuzz(){
        FizzBuzz newFizzBuzz = new FizzBuzz(15);

        assertEquals(newFizzBuzz.isFizzBuzz(), "FizzBuzz");
    }
}
