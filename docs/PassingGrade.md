# Passing Grade

### Requirement:

A student passes an exam if s/he gets a grade >= 5.0. Grades below that are a fail.

Grades range from [1.0, 10.0]. Assume the system doesn't allow for invalid grades (e.g., 0.9, 10.5).

### Variables

| Variables | Types   | Ranges     | Notes                |
|-----------|---------|------------|----------------------|
| grade     | float   | [1, 10]    | (no one gets a 0...) |
| pass      | boolean | true/false | output variable      |

### Dependencies among variables

- No dependencies among input variables (grade is the only one).
- Grade is used to decide the pass/fail.

### Equivalence partitioning / Boundary analysis

| Variable | Equivalence Classes | Invalid Classes | Boundaries |
|----------|---------------------|-----------------|------------|
| grade    | [1,5[               |                 | 1          |
|          |                     |                 | 4.9        |
|          |                     |                 | 5          |
|          | [5, 10]             |                 | 4.9        |
|          |                     |                 | 5          |
|          |                     |                 | 10         |

We do not need to test 0.9 and 10.1 because we assume that the system doesn't allow for them.

### Strategy

Boundaries seem to be enough.

| Test Case | Grade (input) | Pass (output) | Notes          |
|-----------|---------------|---------------|----------------|
| T1        | 1             | false         |                |
| T2        | 4.9           | false         |                |
| T3        | 5             | true          |                |
| T4        | 7.5           | true          |                |
| T5        | 10            | true          | extra in-point |