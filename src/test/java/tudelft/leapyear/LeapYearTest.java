package tudelft.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {

    private final LeapYear leapYear = new LeapYear();

    @Test
    public void leapYearsThatAreNonCenturialYears() {
        assertTrue(leapYear.isLeapYear(2016));
    }

    @Test
    public void leapCenturialYears() {
        assertTrue(leapYear.isLeapYear(2000));
    }

    @Test
    public void nonLeapCenturialYears() {
        assertFalse(leapYear.isLeapYear(1500));
    }

    @Test
    public void nonLeapYears() {
        assertFalse(leapYear.isLeapYear(2017));
    }
}
