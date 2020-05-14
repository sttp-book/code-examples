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
                /* T01 */ Arguments.of(20),
                /* T02 */ Arguments.of(40),
                /* T03 */ Arguments.of(60),
                /* T04 */ Arguments.of(80),
                /* T05 */ Arguments.of(100),
                /* T06 */ Arguments.of(120),
                /* T07 */ Arguments.of(140),
                /* T08 */ Arguments.of(160),
                /* T09 */ Arguments.of(180),
                /* T10 */ Arguments.of(200)
        );
    }

    @ParameterizedTest
    @MethodSource("invalidGenerator")
    void invalidTest(int amount) {
        assertFalse(new ATM().validWithdraw(amount));
    }

    private static Stream<Arguments> invalidGenerator() {
        return Stream.of(
                /* T12 */ Arguments.of(41),
                /* T13 */ Arguments.of(61)
        );
    }

    @ParameterizedTest
    @MethodSource("illegalArgGenerator")
    void illegalArgTest(int amount) {
        assertThrows(IllegalArgumentException.class, () -> new ATM().validWithdraw(amount));
    }

    private static Stream<Arguments> illegalArgGenerator() {
        return Stream.of(
                /* T11 */ Arguments.of(19),
                /* T14 */ Arguments.of(-1)
        );
    }


}