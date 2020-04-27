package tudelft.pbt;

import net.jqwik.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzTest {

    private final FizzBuzz fb = new FizzBuzz();

    @Property
    boolean fizz(@ForAll("divisibleBy3") int i) {
        return fb.fizzbuzz(i).equals("Fizz");
    }

    @Property
    boolean buzz(@ForAll("divisibleBy5") int i) {
        return fb.fizzbuzz(i).equals("Buzz");
    }

    @Property
    boolean fizzbuzz(@ForAll("divisibleBy3and5") int i) {
        return fb.fizzbuzz(i).equals("FizzBuzz");
    }

    @Property
    void noZeroesAndNegatives(@ForAll("negative") int i) {
        assertThrows(IllegalArgumentException.class, () -> fb.fizzbuzz(i).equals("FizzBuzz"));
    }

    @Provide
    Arbitrary<Integer> divisibleBy3() {
        return Arbitraries.integers()
                .greaterOrEqual(1)
                .filter(i -> i % 3 == 0)
                .filter(i -> i % 5 != 0);
    }

    @Provide
    Arbitrary<Integer> divisibleBy5() {
        return Arbitraries.integers()
                .greaterOrEqual(1)
                .filter(i -> i % 5 == 0)
                .filter(i -> i % 3 != 0);
    }

    @Provide
    Arbitrary<Integer> divisibleBy3and5() {
        return Arbitraries.integers()
                .greaterOrEqual(1)
                .filter(i -> i % 3 == 0)
                .filter(i -> i % 5 == 0);
    }

    @Provide
    Arbitrary<Integer> negative() {
        return Arbitraries.integers().lessOrEqual(0);
    }
}
