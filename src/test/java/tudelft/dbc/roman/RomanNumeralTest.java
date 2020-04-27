package tudelft.dbc.roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTest {
    /*
      JUnit creates a new instance of the class before each test,
      so test setup can be assigned as instance fields.
      This has the advantage that references can be made final.
     */
    final private RomanNumeral roman = new RomanNumeral();

    @Test
    public void singleNumber() {
        assertEquals(1, roman.asArabic("I"));
    }

    @Test
    public void numberWithManyDigits() {
        assertEquals(8, roman.asArabic("VIII"));
    }

    @Test
    public void numberWithSubtractiveNotation() {
        assertEquals(4, roman.asArabic("IV"));
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        assertEquals(44, roman.asArabic("XLIV"));
    }
}
