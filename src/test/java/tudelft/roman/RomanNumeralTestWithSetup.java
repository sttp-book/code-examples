package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests the RomanNumeral class.
 * You can also use this test class to test the 
 * RomanNumeralWithStream implementation.
 *
 */
public class RomanNumeralTestWithSetup {
    /*
      JUnit creates a new instance of the class before each test,
      so test setup can be assigned as instance fields.
      This has the advantage that references can be made final.
     */
    final private RomanNumeral roman = new RomanNumeral();

    @Test
    public void singleNumber() {
        Assertions.assertEquals(1, roman.asArabic("I"));
    }

    @Test
    public void numberWithManyDigits() {
        Assertions.assertEquals(8, roman.asArabic("VIII"));
    }

    @Test
    public void numberWithSubtractiveNotation() {
        Assertions.assertEquals(4, roman.asArabic("IV"));
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        Assertions.assertEquals(44, roman.asArabic("XLIV"));
    }
}
