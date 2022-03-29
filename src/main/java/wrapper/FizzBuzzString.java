package wrapper;

public class FizzBuzzString {
    private final String text;

    public FizzBuzzString(String text) {
        this.text = text;
    }

    public boolean contains(int searchNumber) {
        return text.contains(Integer.toString(searchNumber));
    }

    @Override
    public String toString() {
        return text;
    }
}
