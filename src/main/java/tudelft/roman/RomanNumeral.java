package tudelft.roman;

import java.util.Map;

public class RomanNumeral {
    private final static Map<Character, Integer> CHAR_TO_DIGIT = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

    public int asArabic(String roman) {
        final var digits = roman.chars().map(c -> CHAR_TO_DIGIT.get((char)c)).toArray();

        int result = 0;
        for(int i = 0; i < digits.length; i++) {
            final var currentNumber = digits[i];
            result += isSubtractive(digits, i, currentNumber) ? -currentNumber : currentNumber;
        }

        return result;
    }

    private static boolean isSubtractive(int[] digits, int i, int currentNumber) {
        return i + 1 < digits.length
            && currentNumber < digits[i + 1];
    }
}
