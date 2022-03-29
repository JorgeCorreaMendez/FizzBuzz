package wrapper;

public class FizzBuzzInt {
    private int number;

    public FizzBuzzInt(int number) {
        this.number = number;
    }

    public boolean isMultipleOf(int multiple) {
        return number % multiple == 0;
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }
}
