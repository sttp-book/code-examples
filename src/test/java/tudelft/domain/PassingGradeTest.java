package tudelft.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tudelft.domain.PassingGrade;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PassingGradeTest {

    @ParameterizedTest
    @MethodSource("generator")
    void passed(float grade, boolean pass) {
        boolean result = new PassingGrade().passed(grade);
        assertEquals(pass, result);
    }

    private static Stream<Arguments> generator() {
        return Stream.of(
                Arguments.of(1.0f, false),
                Arguments.of(4.9f, false),
                Arguments.of(5.0f, true),
                Arguments.of(10.0f, true),
                Arguments.of(7.5f, true)
        );
    }
}