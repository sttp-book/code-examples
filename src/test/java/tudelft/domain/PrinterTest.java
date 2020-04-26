package tudelft.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {

    @ParameterizedTest
    @MethodSource("invalidStringGenerator")
    void printerStringLength(String firstname, String middleName, String lastName) {
        assertThrows(IllegalArgumentException.class,
                () -> new Printer().compose(firstname, middleName, lastName));
    }

    private static Stream<Arguments> invalidStringGenerator() {
        return Stream.of(
                /* T13 */ Arguments.of(null, "MMMMMMMMMMMMMM", "LLLLLLLLLLLLLLLLLLLL"),
                /* T14 */ Arguments.of("FFFFFFFFFFF", null, "LLLLLLLLLLLLLLLLLLLLLLL"),
                /* T15 */ Arguments.of("FFFFFFFFF", "MMMMMMMMMMMMMMMMMMM", null)
        );
    }

    @ParameterizedTest
    @MethodSource("invalidLengthGenerator")
    void printerInvalidLength(String firstname, String middleName, String lastName) {
        assertThrows(Printer.WrongLengthException.class,
                () -> new Printer().compose(firstname, middleName, lastName));
    }

    private static Stream<Arguments> invalidLengthGenerator() {
        return Stream.of(
                /* T01 */ Arguments.of("", "MMMMMMMMMMMMMMM", "LLLLLLL"),
                /* T04 */ Arguments.of("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "MMMMMMMMMMMMMMMMMMMMM", "LLLLLLLLLLLL"),
                /* T06 */ // Arguments.of("FFFFFFFFFFFFFFFFFFFF", "", "LLLLLLL"),
                /* T08 */ Arguments.of("FFFFFFFFFFFFFFFFFFFFFF", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "LLL"),
                /* T10 */ // Arguments.of("FF", "MMMMMM", ""),
                /* T12 */ Arguments.of("FFFFFFFFFFFF", "MMMMMMMMMMMMMMMMMMMMMMMMMMM", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL"),
                /* T17 */ Arguments.of("FFFFFFFFFFFFFFFFFFFFFFF", "MMMMMMMMMMMMMMMMMMMMMMM", "LLLLLLLLLLLLLLLLLLLLLLL")
        );
    }

    @ParameterizedTest
    @MethodSource("validGenerator")
    void printerValid(String firstname, String middleName, String lastName, String composed) {
        assertEquals(composed, new Printer().compose(firstname, middleName, lastName));
    }

    private static Stream<Arguments> validGenerator() {
        return Stream.of(
                /* T02 */ Arguments.of("F", "MMMMMMM", "LL", "F MMMMMMM LL"),
                /* T03 */ Arguments.of("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "MMM", "LLLLLLLLL", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFF MMM LLLLLLLLL"),
                /* T05 */ Arguments.of("FFFFFFFFFFFFFFF", "", "LLLLLLLLLLLLLLL", "FFFFFFFFFFFFFFF LLLLLLLLLLLLLLL"),
                /* T07 */ Arguments.of("FFFFFFFFFFFFFFFFFFFFF", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "LLLLLL", "FFFFFFFFFFFFFFFFFFFFF MMMMMMMMMMMMMMMMMMMMMMMMMMMMMM LLLLLL"),
                /* T09 */ Arguments.of("FFFFFFF", "MMM", "", "FFFFFFF MMM"),
                /* T11 */ Arguments.of("FFFFFFFFF", "MMMMMMMMMMMMMMMMMM", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLL", "FFFFFFFFF MMMMMMMMMMMMMMMMMM LLLLLLLLLLLLLLLLLLLLLLLLLLLLLL"),
                /* T16 */ Arguments.of("FFFFFFFFFFFFFFFFFFFFFFF", "MMMMMMMMMMMMMMMMMMMMMMM", "LLLLLLLLLLLLLLLLLLLLLL", "FFFFFFFFFFFFFFFFFFFFFFF MMMMMMMMMMMMMMMMMMMMMMM LLLLLLLLLLLLLLLLLLLLLL")
        );
    }

}