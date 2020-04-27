package tudelft.pbt;

public class FizzBuzz {

    public String fizzbuzz(int number) {
        boolean divBy3 = number % 3 == 0;
        boolean divBy5 = number % 5 == 0;

        if(number<=0)
            throw new IllegalArgumentException();

        if(divBy3 && divBy5)
            return "FizzBuzz";
        if(divBy3)
            return "Fizz";
        return "Buzz";

    }
}
