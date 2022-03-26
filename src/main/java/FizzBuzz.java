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


}
