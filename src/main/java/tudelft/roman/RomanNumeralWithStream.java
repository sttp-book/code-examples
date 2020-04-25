package tudelft.roman;

import java.util.Map;
import java.util.stream.IntStream;

public class RomanNumeralWithStream implements RomanConverter {
    private final static Map<Character, Integer> RomanToArabic = 
            Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

    @Override
    public int asArabic(String roman) {
        // Create a new array with every roman numeral converted to the corresponding number,
        // with a zero (0) appended at the end.
        // (The char conversion is needed because String.chars() returns an IntStream.)
        final var numbers = 
            IntStream.concat(
                roman.chars().mapToObj(i -> (char) i).mapToInt(RomanToArabic::get),
                IntStream.of(0)).toArray();
        
        var previousNumber = -1;
        var result = 0;
        for (var currentNumber : numbers) {
            if (previousNumber != -1) {
                var isSubtractive = previousNumber < currentNumber;
                var factor = isSubtractive ? -1 : 1;
                result += factor * previousNumber;
            }
            previousNumber = currentNumber;
        }
        return result;
    }
}
