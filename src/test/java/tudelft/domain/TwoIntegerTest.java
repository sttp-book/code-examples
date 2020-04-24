package tudelft.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.domain.TwoInteger;

class TwoIntegerTest {

  // invalid input cases
  @ParameterizedTest(name = "num1={0}, num2={1}")
  @CsvSource({
          "-100, 50", /* T2, x is in invalid partition: x >= 1, y is fixed valid */
          "250, 50",  /* T3, x is in invalid partition: x <= 99, y is fixed valid */
          "0, 50",    /* T4, x is the off-point: x >= 1, y is fixed valid */
          "100, 50",  /* T7, x is the off-point: x <= 99, y is fixed valid */
          "50, -100", /* T9, y is in invalid partition: y >= 1, x is fixed valid */
          "50, 250",  /* T10, y is in invalid partition: y <= 99, x is fixed valid */
          "50, 0",    /* T11, y is the off-point: y >= 1, x is fixed valid */
          "50, 100"   /* T14, y is the off-point: y <= 99, x is fixed valid */
  })
  void sumInvalidCases(int num1, int num2) {
    TwoInteger adder = new TwoInteger();
    Assertions.assertThrows(AssertionError.class, () -> adder.sum(num1, num2));
  }

  //valid input cases
  @ParameterizedTest(name = "num1={0}, num2={1}, result={2}")
  @CsvSource({
          "50, 50, 100",  /* T1, x is in valid partition: x >= 1 and x <= 99 , y is fixed valid */
          "1, 50, 51",    /* T5, x is the on-point: x >= 1 , y is fixed valid */
          "99, 50, 149",  /* T6, x is the on-point: x <= 99 , y is fixed valid */
          "50, 50, 100",  /* T8, y is in valid partition: y >= 1 and y <= 99 , x is fixed valid */
          "50, 1, 51",    /* T12, y is the on-point: y >= 1 , x is fixed valid */
          "50, 99, 149"   /* T13, y is the on-point: y <= 99 , x is fixed valid */
  })
  void sumValidCases(int num1, int num2, int result) {
    TwoInteger adder = new TwoInteger();
    Assertions.assertEquals(result, adder.sum(num1, num2));
  }
}