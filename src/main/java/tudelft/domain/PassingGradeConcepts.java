package tudelft.domain;

public class PassingGradeConcepts {
    enum Concept {
        A,
        B,
        C,
        D,
        E,
        F
    }

    public Concept calculateGrade(float grade) {
        if (grade < 1.0f || grade > 10.0f) {
            throw new IllegalArgumentException("Invalid grade point specified!");
        }

        if (grade < 5.0f) {
            return Concept.F;
        } else if (grade < 6.0f) {
            return Concept.E;
        } else if (grade < 7.0f) {
            return Concept.D;
        } else if (grade < 8.0f) {
            return Concept.C;
        } else if (grade < 9.0f) {
            return Concept.B;
        } else {
            return Concept.A;
        }
    }
}
