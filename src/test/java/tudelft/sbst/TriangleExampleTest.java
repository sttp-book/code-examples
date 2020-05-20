package tudelft.sbst;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TriangleExampleTest {

    @Test
    void t1() {
        Triangle t = new Triangle(5, 7, 10);
        Triangle.TriangleType type = t.classify();
        assertThat(type).isEqualTo(Triangle.TriangleType.SCALENE);
    }
}
