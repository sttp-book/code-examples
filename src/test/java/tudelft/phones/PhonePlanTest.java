package tudelft.phones;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PhonePlanTest {

    @Test
    void localExpensive() {
        PhonePlan plan = new PhonePlan(false, false, false);
        assertEquals(15, plan.pricePerMonth());
    }

    @Test
    void internationalExpensive() {
        PhonePlan plan = new PhonePlan(true, false, false);
        assertEquals(32, plan.pricePerMonth());
    }

    @Test
    void localCheap() {
        PhonePlan plan = new PhonePlan(false, true, false);
        assertEquals(10, plan.pricePerMonth());
    }

    @Test
    void internationalCheap() {
        PhonePlan plan = new PhonePlan(true, false, true);
        assertEquals(30, plan.pricePerMonth());
    }

    @ParameterizedTest
    @CsvSource({
            "true,  false, false, 32",
            "true,  false, true,  30",
            "false, false, false, 15",
            "false, true,  false, 10"
    })
    void testPlan(boolean international, boolean autoRenewal, boolean loyal, int expected) {
        PhonePlan plan = new PhonePlan(international, autoRenewal, loyal);
        assertEquals(expected, plan.pricePerMonth());
    }

}
