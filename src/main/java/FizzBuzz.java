public class FizzBuzz {
    private int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public boolean isMultipleOf(int multiple) {
        return number % multiple == 0;
    }

    public String isFizz() {
        if (isMultipleOf(3)) return "Fizz";

        return Integer.toString(number);
    }

    public String isBuzz() {
        if (isMultipleOf(5)) return "Buzz";

        return Integer.toString(number);
    }

    public String isFizzBuzz() {
        if (isMultipleOf(3) && isMultipleOf(5)) return "FizzBuzz";

        return Integer.toString(number);
    }

    public String whatIs() {
        if (isMultipleOf(3) && isMultipleOf(5)) {
            return "FizzBuzz";
        } else if (isMultipleOf(3) || contains(3)) {
            return "Fizz";
        } else if (isMultipleOf(5) || contains(5)) {
            return "Buzz";
        }

        return Integer.toString(number);
    }

    public boolean contains(int searchNumber){
        String worldToSearch = Integer.toString(searchNumber);
        String numberString = Integer.toString(number);

        return numberString.contains(worldToSearch);
    }
}
