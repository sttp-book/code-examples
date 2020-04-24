package tudelft.passinggrade;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for calculating grades (the PassingGradeConcept class)
 */
class PassingGradeConceptTest {
    PassingGradeConcept passingGradeConcept = new PassingGradeConcept();

    /**
     * Parameterized test that tests lower & upper
     * boundaries for all grade concepts.
     *
     * We consider lower boundaries which are inclusive, upper boundaries
     * which are exclusive. We also use 2 test cases to test both sides
     * of the exclusive boundaries.
     *
     * @param grade     Grade point (input argument)
     * @param concept   Corresponding expected concept (enumeration)
     */
    @ParameterizedTest
    @CsvSource({
            "1.0f, F",  // Lower boundary (F)
            "4.9f, F",  // In point (F)
            "5.0f, E",  // Upper boundary (F), lower boundary (E)
            "5.9f, E",  // In point (E)
            "6.0f, D",  // Upper boundary (E), lower boundary (D)
            "6.9f, D",  // In point (D)
            "7.0f, C",  // Upper boundary (D), lower boundary (C)
            "7.9f, C",  // In point (C)
            "8.0f, B",  // Upper boundary (C), lower boundary (B)
            "8.9f, B",  // In point (B)
            "9.0f, A",  // Upper boundary (B), lower boundary (A)
            "10.0f, A"  // Upper boundary (A)
    })
    public void testGradeBoundaryTests(float grade, PassingGradeConcept.Concept concept) {
        PassingGradeConcept.Concept result = passingGradeConcept.calculateGrade(grade);
        assertEquals(concept, result, "Expected " + concept + " for grade " + grade);
    }
}