import wrapper.FizzBuzzInt;

public class FizzBuzz {
    private FizzBuzzInt number;

    public FizzBuzz(int number) {
        this.number = new FizzBuzzInt(number);
    }

    public String isFizz() {
        if (number.isMultipleOf(3)) return "Fizz";

        return number.toString();
    }

    public String isBuzz() {
        if (number.isMultipleOf(5)) return "Buzz";

        return number.toString();
    }

    public String isFizzBuzz() {
        if (number.isMultipleOf(3) && number.isMultipleOf(5)) return "FizzBuzz";

        return number.toString();
    }

    public String whatIs() {
        if (number.isMultipleOf(3) && number.isMultipleOf(5)) return "FizzBuzz";
        if (number.isMultipleOf(3) || contains(3)) return "Fizz";
        if (number.isMultipleOf(5) || contains(5)) return "Buzz";

        return number.toString();
    }

    public boolean contains(int searchNumber) {
        String worldToSearch = Integer.toString(searchNumber);
        String numberString = number.toString();

        return numberString.contains(worldToSearch);
    }
}
