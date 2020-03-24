package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {


    @Test
    public void singleNumber() {
        var roman = new RomanNumeral();
        var result = roman.asArabic("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        var roman = new RomanNumeral();
        var result = roman.asArabic("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        var roman = new RomanNumeral();
        var result = roman.asArabic("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        var roman = new RomanNumeral();
        var result = roman.asArabic("XLIV");
        Assertions.assertEquals(44, result);
    }
}
