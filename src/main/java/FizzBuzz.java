public class FizzBuzz {
    private int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public boolean isMultipleOf3(){
        if(number % 3 == 0)
            return true;

        return false;
    }

    public boolean isMultipleOf5(){
        if(number % 5 == 0)
            return true;

        return false;
    }

    public String isFizz(){
        if(isMultipleOf3()) return "Fizz";

        return "";
    }

    public String isBuzz(){
        if(isMultipleOf5()) return "Buzz";

        return "";
    }

    public String isFizzBuzz(){
        if(isMultipleOf5() && isMultipleOf3()) return "FizzBuzz";

        return "";
    }
}
