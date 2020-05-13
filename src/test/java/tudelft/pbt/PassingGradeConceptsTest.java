package tudelft.pbt;

import net.jqwik.api.*;
import net.jqwik.api.constraints.FloatRange;
import tudelft.domain.PassingGradeConcepts;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassingGradeConceptsTest {

    private PassingGradeConcepts passingGradeConcepts = new PassingGradeConcepts();

    @Property
    void fail(@ForAll @FloatRange(min = 1f, max = 5f, maxIncluded = false) float grade){
        assertEquals(passingGradeConcepts.calculateGrade(grade),PassingGradeConcepts.Concept.F);
    }

    @Property
    void passE(@ForAll @FloatRange(min = 5f, max = 6f, maxIncluded = false) float grade){
        assertEquals(passingGradeConcepts.calculateGrade(grade),PassingGradeConcepts.Concept.E);
    }

    @Property
    void passD(@ForAll @FloatRange(min = 6f, max = 7f, maxIncluded = false) float grade){
        assertEquals(passingGradeConcepts.calculateGrade(grade), PassingGradeConcepts.Concept.D);
    }

    @Property
    void passC(@ForAll @FloatRange(min = 7f, max = 8f, maxIncluded = false) float grade){
        assertEquals(passingGradeConcepts.calculateGrade(grade),PassingGradeConcepts.Concept.C);
    }

    @Property
    void passB(@ForAll @FloatRange(min = 8f, max = 9f, maxIncluded = false) float grade){
        assertEquals(passingGradeConcepts.calculateGrade(grade),PassingGradeConcepts.Concept.B);
    }

    @Property
    void passA(@ForAll @FloatRange(min = 9f, max = 10f, maxIncluded = true) float grade){
        assertEquals(passingGradeConcepts.calculateGrade(grade),PassingGradeConcepts.Concept.A);
    }

    @Property
    void invalid(@ForAll("invalidRange") float grade){
        assertThrows(IllegalArgumentException.class, () -> passingGradeConcepts.calculateGrade(grade));
    }

    @Provide
    private Arbitrary<Float> invalidRange(){
        return Arbitraries.oneOf(
                Arbitraries.floats().lessOrEqual(0.9f),
                Arbitraries.floats().greaterOrEqual(10.1f));
    }
}
