package tudelft.pbt;

import net.jqwik.api.*;
import net.jqwik.api.constraints.IntRange;
import tudelft.domain.TwoIntegers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TwoIntegersTest {

    private TwoIntegers twoIntegers = new TwoIntegers();

    @Property
    void pass(@ForAll @IntRange(min = 1, max = 99) int n, @ForAll @IntRange(min = 1, max = 99) int m){
        assertEquals(twoIntegers.sum(n,m), n+m);
    }

    @Property
    void invalidN(@ForAll("invalidRange") int n, @ForAll @IntRange(min = 1, max = 99) int m){
        assertThrows(AssertionError.class, () -> twoIntegers.sum(n,m));
    }

    @Property
    void invalidM(@ForAll @IntRange(min = 1, max = 99) int n, @ForAll("invalidRange") int m){
        assertThrows(AssertionError.class, () -> twoIntegers.sum(n,m));
    }

    @Property
    void invalidBoth(@ForAll("invalidRange") int n, @ForAll("invalidRange") int m){
        assertThrows(AssertionError.class, () -> twoIntegers.sum(n,m));
    }

    @Provide
    private Arbitrary<Integer> invalidRange(){
        return Arbitraries.oneOf(
                Arbitraries.integers().lessOrEqual(0),
                Arbitraries.integers().greaterOrEqual(100));
    }
}
