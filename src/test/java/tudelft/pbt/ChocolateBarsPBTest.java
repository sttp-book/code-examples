package tudelft.pbt;

import net.jqwik.api.*;
import net.jqwik.api.arbitraries.IntegerArbitrary;
import tudelft.domain.ChocolateBars;

import static org.assertj.core.api.Assertions.assertThat;

public class ChocolateBarsPBTest {

    private final ChocolateBars chocolateBars = new ChocolateBars();

    @Property
    void onlySmallBars(@ForAll("onlySmall") ChocolateBarsTestInput input) {
        assertThat(chocolateBars.calculate(input.small, input.big, input.total))
                .isEqualTo(input.total);
    }

    @Property
    void onlyBigBars(@ForAll("onlyBig") ChocolateBarsTestInput input) {
        assertThat(chocolateBars.calculate(input.small, input.big, input.total)).isEqualTo(0);
    }

    @Property
    void bothBars(@ForAll("both") ChocolateBarsTestInput input) {
        assertThat(chocolateBars.calculate(input.small, input.big, input.total))
                .isEqualTo(input.total - Math.min(input.total / 5, input.big) * 5);
    }

    @Property
    void noBars(@ForAll("none") ChocolateBarsTestInput input) {
        assertThat(chocolateBars.calculate(input.small, input.big, input.total)).isEqualTo(-1);
    }

    static class ChocolateBarsTestInput {
        int small;
        int big;
        int total;

        public ChocolateBarsTestInput(int small, int big, int total) {
            this.small = small;
            this.big = big;
            this.total = total;
        }
    }

    @Provide
    private Arbitrary<ChocolateBarsTestInput> onlySmall() {
        IntegerArbitrary small = Arbitraries.integers().greaterOrEqual(0);
        IntegerArbitrary big = Arbitraries.integers().greaterOrEqual(0);
        IntegerArbitrary total = Arbitraries.integers().greaterOrEqual(0);

        return Combinators.combine(small, big, total).as(ChocolateBarsTestInput::new)
                .filter(k -> (k.total < 5 || k.big == 0) && k.small >= k.total);
    }

    @Provide
    private Arbitrary<ChocolateBarsTestInput> onlyBig() {
        IntegerArbitrary small = Arbitraries.integers().greaterOrEqual(0);
        IntegerArbitrary big = Arbitraries.integers().greaterOrEqual(0);
        IntegerArbitrary total = Arbitraries.integers().greaterOrEqual(0);

        return Combinators.combine(small, big, total).as(ChocolateBarsTestInput::new)
                .filter(k -> k.total <= 5 * k.big && k.total % 5 == 0);
    }

    @Provide
    private Arbitrary<ChocolateBarsTestInput> both() {
        IntegerArbitrary small = Arbitraries.integers().greaterOrEqual(1);
        IntegerArbitrary big = Arbitraries.integers().greaterOrEqual(1);
        IntegerArbitrary total = Arbitraries.integers().greaterOrEqual(1);

        return Combinators.combine(small, big, total).as(ChocolateBarsTestInput::new)
                .filter(k -> k.total - k.big * 5 > 0 && k.small >= k.total - k.big * 5);
    }

    @Provide
    private Arbitrary<ChocolateBarsTestInput> none() {
        IntegerArbitrary small = Arbitraries.integers().greaterOrEqual(0);
        IntegerArbitrary big = Arbitraries.integers().greaterOrEqual(0);
        IntegerArbitrary total = Arbitraries.integers().greaterOrEqual(1);

        return Combinators.combine(small, big, total).as(ChocolateBarsTestInput::new)
                .filter(k -> k.small < k.total - Math.min(k.total / 5, k.big) * 5);
    }
}
