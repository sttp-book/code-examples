package tudelft.roman;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Map;

public class RomanNumeral {
    private final static Map<Character, Integer> RomanToArabic = 
            Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

    public int asArabic(String roman) {
        final var iter = new StringCharacterIterator(roman);

        var nextValue = 0;
        var result = 0;
        for (char c = iter.last(); c != CharacterIterator.DONE; c = iter.previous()) {
            var currentValue = RomanToArabic.get(c);
            var isSubtractive = currentValue < nextValue;
            var factor = isSubtractive ? -1 : 1;
            result += factor * currentValue;

            nextValue = currentValue;
        }

        return result;
    }
}
