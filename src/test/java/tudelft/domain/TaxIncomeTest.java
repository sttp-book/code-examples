package tudelft.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TaxIncomeTest {

    @ParameterizedTest
    @MethodSource("generator")
    void boundaries(double income, double expectedResult) {
        double result = new TaxIncome().calculate(income);
        Assertions.assertEquals(expectedResult, result);
    }

    // Income Tax Brackets

    // B1: 0 <= Income < 22100 -> 0.15 x Income
    // B2: 22100 <= Income < 53500 -> 3315 + 0.28 * (Income - 22100)
    // B3: 53500 <= Income < 115000 -> 12107 + 0.31 * (Income - 53500)
    // B4: 115000 <= Income < 250000 -> 31172 + 0.36 * (Income - 115000)
    // B5: 250000 <= Income -> 79772 + 0.396 * (Income - 250000)

    private static Stream<Arguments> generator() {
        return Stream.of(
            Arguments.of(-1.0, TaxIncome.CANNOT_CALC_TAX),            // T1: OFF Point B1 lower
            Arguments.of(0.0, 0.0),                                     // T2: ON Point B1 lower
            Arguments.of(22099.0, 0.15 * 22099),                      // T3: OFF Point B1 upper & B2 lower
            Arguments.of(22100.0, 3315.0),                              // T4: ON Point B1 upper & B2 lower
            Arguments.of(53499.0, 3315.0 + 0.28 * (53499 - 22100)),     // T5: OFF Point B2 upper & B3 lower
            Arguments.of(53500.0, 12107.0),                             // T6: ON Point B2 upper & B3 lower
            Arguments.of(114999.0, 12107.0 + 0.31 * (114999 - 53500)),  // T7: OFF Point B3 upper & B4 lower
            Arguments.of(115000.0, 31172.0),                            // T8: ON Point B3 upper & B4 lower
            Arguments.of(249999.0, 31172.0 + 0.36 * (249999 - 115000)), // T9: OFF Point B4 upper & B5 lower
            Arguments.of(250000.0, 79772.0)                             // T10: ON Point B4 upper & B5 lower
        );

    }

}
