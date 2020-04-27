package tudelft.dbc.roman;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RomanConverterTest {

    private final static List<RomanConverter> CONVERTERS = Arrays.asList(
            new RomanNumeral(),
            new RomanNumeralWithStream(),
            new RomanNumeralWithFancierStream()
    );

    @ParameterizedTest
    @MethodSource("equalsGenerator")
    void asArabic(RomanConverter converter, int expected, String roman) {
        assertEquals(expected, converter.asArabic(roman));
    }

    /**
     * This method will convert the values in the "map-like" (key/value) list
     * to a Stream of arguments for each implementation of the RomanConverter interface.
     *
     * The different classes which we can derive from the context of the `asArabic()` method are:
     *      1. Size of input: Single/Multiple characters
     *      2. Special values: Negative/Blank/Null
     *      3. Subtractive input for single/multiple characters
     *
     * Now we know that there are no special roman numeral for negative numbers,
     * nor does the algorithm handle null values well - so we can skip those as they are
     * not in the specification of the program.
     *
     * So we will test the following cases:
     *      1. Single character
     *      2. Special value 'Blank'
     *      3. Multiple characters not subtractive
     *      4. Multiple characters with subtractive input
     *      5. Multiple characters with mixed subtractive input
     *
     * Arguably we could only test each class once, but since its so easy to add new test cases
     * we might as well test a few possibilities out there :)
     */
    private static Stream<Arguments> equalsGenerator() {
        return implWith(Arrays.asList(
                // Test single characters
                1, "I",
                5, "V",
                10, "X",
                50, "L",
                100, "C",
                500, "D",
                1000, "M",

                // Special cases
                0, "",

                // Multiple values not subtractive
                2, "II",
                3, "III",
                6, "VI",
                7, "VII",
                8, "VIII",
                60, "LX",
                80, "LXXX",

                // Multiple values subtractive
                4, "IV",
                9, "IX",
                40, "XL",

                // Mixed subtractive/non subtractive input
                97, "XCVII",
                1678, "MDCLXXVIII",
                999, "CMXCIX",
                3888, "MMMDCCCLXXXVIII"
        ));
    }

    private static Stream<Arguments> implWith(List<?> list) {
        return IntStream.range(0, list.size())
                .filter(i -> i % 2 == 0)
                .boxed()
                .flatMap(i -> create(list.get(i), list.get(i + 1)));
    }

    private static Stream<Arguments> create(Object arabic, Object roman) {
        return CONVERTERS.stream()
                .map(impl -> Arguments.of(impl, arabic, roman));
    }
}