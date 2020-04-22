package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ChocolateBarsTest4 {

    @ParameterizedTest(name = "small={0}, big={1}, total={2}, result={3}")
    @MethodSource("generator")
    void boundaries(int small, int big, int total, int expectedResult) {
        int result = new ChocolateBars().calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> generator() {
        return Stream.of(
            // The total is higher than the amount of small and big bars.
            Arguments.of(1,1,5,0),
            Arguments.of(1,1,6,1),
            Arguments.of(1,1,7,-1),
            Arguments.of(1,1,8,-1),
            // No need for small bars.
            Arguments.of(4,0,10,-1),
            Arguments.of(4,1,10,-1),
            Arguments.of(5,2,10,0),
            Arguments.of(5,3,10,0),
            // Need for big and small bars.
            Arguments.of(0,3,17,-1),
            Arguments.of(1,3,17,-1),
            Arguments.of(2,3,17,2),
            Arguments.of(3,3,17,2),
            Arguments.of(0,3,12,-1),
            Arguments.of(1,3,12,-1),
            Arguments.of(2,3,12,2),
            Arguments.of(3,3,12,2),
            // Only small bars.
            Arguments.of(4,2,3,3),
            Arguments.of(3,2,3,3),
            Arguments.of(2,2,3,-1),
            Arguments.of(1,2,3,-1)
        );

    }

}
