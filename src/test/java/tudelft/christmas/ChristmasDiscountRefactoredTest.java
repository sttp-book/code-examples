package tudelft.christmas;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Calendar;
import java.util.GregorianCalendar;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ChristmasDiscountRefactoredTest {

    private final Clock clock = Mockito.mock(Clock.class);
    private final ChristmasDiscountRefactored cd = new ChristmasDiscountRefactored(clock);

    @Test
    public void christmas() {
        Calendar christmas = new GregorianCalendar(2015, Calendar.DECEMBER, 25);
        when(clock.now()).thenReturn(christmas);

        double finalValue = cd.applyDiscount(100.0);
        assertEquals(85.0, finalValue, 0.0001);
    }

    @Test
    public void notChristmas() {
        Calendar christmas = new GregorianCalendar(2015, Calendar.JANUARY, 25);
        when(clock.now()).thenReturn(christmas);

        double finalValue = cd.applyDiscount(100.0);
        assertEquals(100.0, finalValue, 0.0001);
    }
}
