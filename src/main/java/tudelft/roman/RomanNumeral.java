package tudelft.roman;

import java.util.Map;

public class RomanNumeral {
    private final static Map<Character, Integer> map = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

    public int convert(String roman) {

        int arabic = 0;
        for(int i = 0; i < roman.length(); i++) {
            int currentNumber = map.get(roman.charAt(i));
            int next = i+1 < roman.length() ? map.get(roman.charAt(i+1)) : 0;

            arabic += currentNumber >= next ? currentNumber : -currentNumber;
        }

        return arabic;

    }
}
