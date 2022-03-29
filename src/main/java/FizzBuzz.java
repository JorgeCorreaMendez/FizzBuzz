import wrapper.FizzBuzzInt;
import wrapper.FizzBuzzString;

public class FizzBuzz {
    private FizzBuzzInt number;
    private FizzBuzzString numberString;

    public FizzBuzz(FizzBuzzInt number) {
        this.number = number;
        this.numberString = new FizzBuzzString(number.toString());
    }

    public FizzBuzzString whatIs() {
        if (number.isMultipleOf(3) && number.isMultipleOf(5)) return new FizzBuzzString("FizzBuzz");
        if (number.isMultipleOf(3) || numberString.contains(3)) return new FizzBuzzString("Fizz");
        if (number.isMultipleOf(5) || numberString.contains(5)) return new FizzBuzzString("Buzz");

        return numberString;
    }
}
