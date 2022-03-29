import wrapper.FizzBuzzInt;

public class App {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            FizzBuzzInt newFizzBuzzInt = new FizzBuzzInt(i);
            FizzBuzz newFizzBuzz = new FizzBuzz(newFizzBuzzInt);

            System.out.println(newFizzBuzz.whatIs());
        }
    }
}
