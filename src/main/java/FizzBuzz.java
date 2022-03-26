public class FizzBuzz {
    private int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public boolean isMultipleOf2(){
        if(number % 2 == 0)
            return true;

        return false;
    }


}
