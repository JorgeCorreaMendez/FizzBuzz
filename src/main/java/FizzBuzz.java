public class FizzBuzz {
    private int[] numbers;

    public FizzBuzz(int number) {
        this.numbers = new int[number];
    }

    public int[] getNumbers() {
        return numbers;
    }

    public static boolean isMultipleOf3(int number){
        if(number % 3 == 0)
            return true;

        return false;
    }

    public static boolean isMultipleOf5(int number){
        if(number % 5 == 0)
            return true;

        return false;
    }

    public static String isFizz(int number){
        if(isMultipleOf3(number)) return "Fizz";

        return "";
    }

    public static String isBuzz(int number){
        if(isMultipleOf5(number)) return "Buzz";

        return "";
    }

    public static String isFizzBuzz(int number){
        if(isMultipleOf5(number) && isMultipleOf3(number)) return "FizzBuzz";

        return "";
    }
}
