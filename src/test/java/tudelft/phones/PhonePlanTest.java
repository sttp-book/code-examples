package tudelft.phones;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class PhonePlanTest {

    @Test
    void localExpensive() {
        PhonePlan plan = new PhonePlan();
        plan.setInternational(false);
        plan.setAutoRenewal(false);
        plan.setLoyal(false);
        assertThat(plan.pricePerMonth()).isEqualTo(15);
    }

    @Test
    void internationalExpensive() {
        PhonePlan plan = new PhonePlan();

        plan.setInternational(true);
        plan.setAutoRenewal(false);
        plan.setLoyal(false);

        assertThat(plan.pricePerMonth())
                .isEqualTo(32);
    }

    @Test
    void localCheap() {
        PhonePlan plan = new PhonePlan();
        plan.setInternational(false);
        plan.setAutoRenewal(true);
        plan.setLoyal(false);
        assertThat(plan.pricePerMonth()).isEqualTo(10);
    }

    @Test
    void internationalCheap() {
        PhonePlan plan = new PhonePlan();
        plan.setInternational(true);
        plan.setAutoRenewal(false);
        plan.setLoyal(true);
        assertThat(plan.pricePerMonth()).isEqualTo(30);
    }

    @ParameterizedTest
    @CsvSource({
            "true,  false, false, 32",
            "true,  false, true,  30",
            "false, false, false, 15",
            "false, true,  false, 10"
    })
    void testPlan(boolean inter,
                  boolean renew,
                  boolean loyal,
                  int expected) {
        PhonePlan plan = new PhonePlan();

        plan.setInternational(inter);
        plan.setAutoRenewal(renew);
        plan.setLoyal(loyal);

        assertThat(plan.pricePerMonth())
                .isEqualTo(expected);

    }

}
