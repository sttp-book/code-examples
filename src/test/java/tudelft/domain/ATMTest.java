package tudelft.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {

    @ParameterizedTest
    @MethodSource("validGenerator")
    void validTest(int amount) {
        assertTrue(new ATM().validWithdraw(amount));
    }

    private static Stream<Arguments> validGenerator() {
        return Stream.of(
                Arguments.of(20),
                Arguments.of(40),
                Arguments.of(60),
                Arguments.of(80),
                Arguments.of(100),
                Arguments.of(120),
                Arguments.of(140),
                Arguments.of(160),
                Arguments.of(180),
                Arguments.of(200)
        );
    }

    @ParameterizedTest
    @MethodSource("invalidGenerator")
    void invalidTest(int amount) {
        assertFalse(new ATM().validWithdraw(amount));
    }

    private static Stream<Arguments> invalidGenerator() {
        return Stream.of(
                Arguments.of(41),
                Arguments.of(61)
        );
    }

    @ParameterizedTest
    @MethodSource("illegalArgGenerator")
    void illegalArgTest(int amount) {
        assertThrows(IllegalArgumentException.class, () -> new ATM().validWithdraw(amount));
    }

    private static Stream<Arguments> illegalArgGenerator() {
        return Stream.of(
                Arguments.of(19),
                Arguments.of(-1)
        );
    }


}