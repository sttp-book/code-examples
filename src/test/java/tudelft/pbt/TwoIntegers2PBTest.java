package tudelft.pbt;

import net.jqwik.api.*;
import net.jqwik.api.arbitraries.IntegerArbitrary;
import net.jqwik.api.constraints.IntRange;
import tudelft.domain.TwoIntegers2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TwoIntegers2PBTest {

    private final TwoIntegers2 twoIntegers2 = new TwoIntegers2();

    @Property
    void invalidN(@ForAll("invalidRange") int n,@ForAll @IntRange(min = 1, max = 99) int m) {
        assertThrows(AssertionError.class, () -> twoIntegers2.sum(n, m));
    }

    @Property
    void invalidM(@ForAll @IntRange(min = 1, max = 99) int n, @ForAll("invalidRange") int m) {
        assertThrows(AssertionError.class, () -> twoIntegers2.sum(n,m));
    }

    @Property
    void invalidBoth(@ForAll("invalidRange") int n, @ForAll("invalidRange") int m) {
        assertThrows(AssertionError.class, () -> twoIntegers2.sum(n, m));
    }

    @Property
    void pass(@ForAll("validSum") TwoIntegers2TestInput input) {
        assertEquals(twoIntegers2.sum(input.n, input.m), input.n + input.m);
    }

    @Property
    void invalidSum(@ForAll("invalidSum") TwoIntegers2TestInput input) {
        assertThrows(AssertionError.class, () -> twoIntegers2.sum(input.n, input.m));
    }

    @Provide
    private Arbitrary<Integer> invalidRange() {
        return Arbitraries.oneOf(
                Arbitraries.integers().lessOrEqual(0),
                Arbitraries.integers().greaterOrEqual(100));
    }

    static class TwoIntegers2TestInput {
        int n;
        int m;

        public TwoIntegers2TestInput(int n, int m) {
            this.n = n;
            this.m = m;
        }
    }

    @Provide
    private Arbitrary<TwoIntegers2TestInput> invalidSum(){
        IntegerArbitrary n = Arbitraries.integers().between(1, 99);
        IntegerArbitrary m = Arbitraries.integers().between(1, 99);

        return Combinators.combine(n, m).as(TwoIntegers2TestInput::new)
                .filter(k -> k.n + k.m > 165);
    }

    @Provide
    private Arbitrary<TwoIntegers2TestInput> validSum(){
        IntegerArbitrary n = Arbitraries.integers().between(1, 99);
        IntegerArbitrary m = Arbitraries.integers().between(1, 99);

        return Combinators.combine(n, m).as(TwoIntegers2TestInput::new)
                .filter(k -> k.n + k.m <= 165);
    }
}
