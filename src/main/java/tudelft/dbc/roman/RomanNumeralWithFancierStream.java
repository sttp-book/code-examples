package tudelft.dbc.roman;

import java.util.Map;
import java.util.stream.IntStream;

public class RomanNumeralWithFancierStream implements RomanConverter {
    private final static Map<Character, Integer> CHAR_TO_DIGIT =
            Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

    @Override
    public int asArabic(String roman) {
        var chars = roman.toCharArray();
        return IntStream.range(0, chars.length)
                .map(i -> getSubtractiveValue(chars, i, asArabic(chars[i])))
                .sum();
    }

    public int asArabic(char c) {
        return CHAR_TO_DIGIT.get(c);
    }

    private int getSubtractiveValue(char[] chars, int i, int currentNumber) {
        return isSubtractive(chars, i, currentNumber) ? -currentNumber : currentNumber;
    }

    private boolean isSubtractive(char[] chars, int i, int currentNumber) {
        return i + 1 < chars.length && currentNumber < asArabic(chars[i + 1]);
    }
}
