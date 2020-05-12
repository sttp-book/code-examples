package tudelft.pbt;

import net.jqwik.api.*;
import net.jqwik.api.constraints.FloatRange;
import tudelft.domain.PassingGrade;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PassingGradesPBTest {

    private final PassingGrade pg = new PassingGrade();

    @Property
    void fail(@ForAll @FloatRange(min = 1f, max = 5.0f, maxIncluded = false) float grade) {
        assertThat(pg.passed(grade)).isFalse();
    }

    @Property
    void pass(@ForAll @FloatRange(min = 5.0f, max = 10.0f, maxIncluded = false) float grade) {
        assertThat(pg.passed(grade)).isTrue();
    }

    @Property
    void invalid(@ForAll("invalidGrades") float grade) {
        assertThatThrownBy(() -> {
            pg.passed(grade);
        })
        .isInstanceOf(IllegalArgumentException.class);
    }

    @Provide
    private Arbitrary<Float> invalidGrades() {
        return Arbitraries.oneOf(
                Arbitraries.floats().lessOrEqual(-0.9f),
                Arbitraries.floats().greaterOrEqual(10.1f));
    }
}
