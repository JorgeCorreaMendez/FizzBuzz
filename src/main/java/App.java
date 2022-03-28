public class App {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            FizzBuzz newFizzBuzz = new FizzBuzz(i);

            System.out.println(newFizzBuzz.whatIs());
        }
    }
}
