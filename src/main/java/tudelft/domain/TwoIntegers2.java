package tudelft.domain;

public class TwoIntegers2 {

  public int sum(int n, int m) {
    assert n >= 1 && n <= 99;
    assert m >= 1 && m <= 99;

    int sum = n + m;
    assert sum <= 165;

    return sum;
  }
}
