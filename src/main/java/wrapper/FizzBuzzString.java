package wrapper;

public class FizzBuzzString {
    private String text;

    public FizzBuzzString(String text) {
        this.text = text;
    }

    public boolean contains(FizzBuzzInt searchNumber) {
        String worldToSearch = searchNumber.toString();

        return text.contains(worldToSearch);
    }

    @Override
    public String toString() {
        return text;
    }
}
