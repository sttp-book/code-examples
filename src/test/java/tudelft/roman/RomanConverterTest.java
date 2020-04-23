package tudelft.roman;

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

    private static Stream<Arguments> equalsGenerator() {
        return implWith(Arrays.asList(
                0, "",
                1, "I",
                2, "II",
                3, "III",
                0, "",
                1, "I",
                2, "II",
                3, "III",
                4, "IV",
                5, "V",
                6, "VI",
                7, "VII",
                8, "VIII",
                9, "IX",
                10, "X",
                40, "XL",
                50, "L",
                60, "LX",
                80, "LXXX",
                97, "XCVII",
                100, "C",
                1678, "MDCLXXVIII",
                500, "D",
                999, "CMXCIX",
                1000, "M",
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