# ATM

### Requirements

An ATM allows you withdraw 20 to 200 euros (inclusive), in increments of 20.

(For the example purposes, the program returns true or false, if the amount required is valid.)

### Variables

| Variable | Type    | Range                                          | Comment |
|----------|---------|------------------------------------------------|---------|
| amount   | integer | [20, 40, 60, 80, 100, 120, 140, 160, 180, 200] |         |
| valid    | boolean | true / false                                   | output  |

### Dependencies among variables

Valid depends on the amount.

### Equivalence partitioning / Boundary analysis

| Variable | Equivalence Class | Invalid Classes | Boundaries |
|----------|-------------------|-----------------|------------|
| Amount   | 20                |                 | 19         |
|          |                   |                 | 21         |
|          | 40                |                 | 39         |
|          |                   |                 | 41         |
|          | 60                |                 | 59         |
|          |                   |                 | 61         |
|          | 80                |                 | 79         |
|          |                   |                 | 81         |
|          | 100               |                 | 99         |
|          |                   |                 | 101        |
|          | 120               |                 | 119        |
|          |                   |                 | 121        |
|          | 140               |                 | 139        |
|          |                   |                 | 141        |
|          | 160               |                 | 159        |
|          |                   |                 | 161        |
|          | 180               |                 | 179        |
|          |                   |                 | 181        |
|          | 200               |                 | 199        |
|          |                   |                 | 201        |
|          |                   | -1              |            |

### Strategy

**Black box testing**: maybe all the on and off points and invalid points.
**White box testing**: maybe just on points, few off points, invalid points. Why? If you know the implementation, you know how hard you need to test it.
Supposing here it's white box testing:

| Test Case | Amount | Valid (output) |
|-----------|--------|----------------|
| T1        | 20     | true           |
| T2        | 40     | true           |
| T3        | 60     | true           |
| T4        | 80     | true           |
| T5        | 100    | true           |
| T6        | 120    | true           |
| T7        | 140    | true           |
| T8        | 160    | true           |
| T9        | 180    | true           |
| T10       | 200    | true           |
| T11       | 19     | false          |
| T12       | 41     | false          |
| T13       | 61     | false          |
| T14       | -1     | false          |