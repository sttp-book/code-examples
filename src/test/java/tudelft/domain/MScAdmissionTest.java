package tudelft.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class MScAdmissionTest {

    private final MScAdmission admission = new MScAdmission();

    @ParameterizedTest
    @MethodSource("validInputs")
    void validInputs(int act, double gpa, boolean expectedResult) {
        boolean admit = admission.admit(act, gpa);

        assertThat(admit).isEqualTo(expectedResult);
    }

    @ParameterizedTest
    @MethodSource("invalidInputs")
    void invalidInputs(int act, double gpa) {
        assertThatThrownBy(() -> {
            admission.admit(act, gpa);
        })
        .isInstanceOf(AssertionError.class)
        .hasMessageContaining("has to be between");
    }

    private static Stream<Arguments> validInputs() {
        return Stream.of(
                Arguments.of(35,3.5, false),
                Arguments.of(36,3.5, true),
                Arguments.of(36,3.4, false),
                Arguments.of(35,3.6, true),
                Arguments.of(34,3.7, true),
                Arguments.of(34,3.6, false),
                Arguments.of(33,3.8, true),
                Arguments.of(32,3.8, false),
                Arguments.of(33,3.7, false),
                Arguments.of(32,3.9, true),
                Arguments.of(31,4.0, true),
                Arguments.of(30,4.0, false),
                Arguments.of(31,3.9, false)
        );
    }

    private static Stream<Arguments> invalidInputs() {
        return Stream.of(
                Arguments.of(-1,4.0),
                Arguments.of(40,4.0),
                Arguments.of(36,-0.1),
                Arguments.of(36,4.1)
        );
    }
}
