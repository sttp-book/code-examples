package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ChocolateBarsTest5 {

    @ParameterizedTest
    @MethodSource("generator")
    void boundaries(int small, int big, int total, int expectedResult) {
        int result = new ChocolateBars().calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> generator() {
        return Stream.of(
            // small and big bars -> only big bars
            Arguments.of(10,1,10,5),
            Arguments.of(10,2,10,0),
            // small and big bars -> only small bars
            Arguments.of(10,1,10,5),
            Arguments.of(10,0,10,10),
            // only small bars, total >=5 -> not enough bars
            Arguments.of(5,0,5,5),
            Arguments.of(4,0,5,-1),
            // only big bars -> not enough bars
            Arguments.of(4,2,10,0),
            Arguments.of(4,1,10,-1),
            // only big bars, not all -> only big bars, all
            Arguments.of(4,3,10,-1),
            Arguments.of(6,0,5,5)
        );

    }

}
