# Printer

### Requirements

A printer prints mailing labels.
The first line is the name of the person.

The program builds the name from three fields: first name, middle name, and last name.
Each field can hold up to 30 characters.
The label can be up to 70 characters wide.

### Variables

| Variables     | Types   | Ranges  |
|---------------|---------|---------|
| Len. of FN    | integer | [1, 30] |
| Len. of MN    | integer | [0, 30] |
| Len. of LN    | integer | [0, 30] |
| Output length | integer | [1, 70] |

### Dependencies among variables

FN + MN + LN <= 68

(The difference of 2 (to 70) happens as the system needs to add an empty space in between names)

### Equivalence partitioning / Boundary analysis

| Variable     | Equivalence Classes | Invalid Classes | Boundaries | Notes                           |
|--------------|---------------------|-----------------|------------|---------------------------------|
| FN           | [1, 30]             | invalid string  | 0          | everybody has a first name      |
|              |                     |                 | 1          |                                 |
|              |                     |                 | 30         |                                 |
|              |                     |                 | 31         | same as >30                     |
| MN           | [0, 30]             | invalid string  | 0          | not everybody has a middle name |
|              |                     |                 | -1         |                                 |
|              |                     |                 | 30         |                                 |
|              |                     |                 | 31         |                                 |
| LN           | [0, 30]             | invalid string  | 0          | not everybody has a last name   |
|              |                     |                 | -1         |                                 |
|              |                     |                 | 30         |                                 |
|              |                     |                 | 31         |                                 |
| (FN, MN, LN) | FM + MN + LN <= 68  |                 | 68         |                                 |
|              |                     |                 | 69         |                                 |

### Strategy

Each variable has 6 partitions, thus: 6 * 6 * 6 = 216 tests.

Let's not combine "invalid strings" with them all. So: 3 tests for exceptional cases + 5 * 5 * 5 = 125 + 3 = 128.

If we focus on the on-points and off-points, and in-points for others, we'd have 4 + 4 + 4 = 12 tests plus invalid cases: 15 tests.

In-points always taking the FN + MN + LN <= 68 restriction into account. 
Two tests for the extra restriction: 17 tests.

| Test Case | FN             | MN             | LN             | (length) | output  |                          |
|-----------|----------------|----------------|----------------|----------|---------|--------------------------|
| T1        | 0              | 15             | 7              | 22       | invalid | FN boundaries            |
| T2        | 1              | 7              | 2              | 10       | valid   |                          |
| T3        | 30             | 3              | 9              | 42       | valid   |                          |
| T4        | 31             | 21             | 12             | 64       | invalid |                          |
| T5        | 15             | 0              | 15             | 30       | valid   | MN boundaries            |
| T6        | 20             | -1             | 7              | 26       | invalid |                          |
| T7        | 21             | 30             | 6              | 57       | valid   |                          |
| T8        | 22             | 31             | 3              | 56       | invalid |                          |
| T9        | 7              | 3              | 0              | 10       | valid   | LN boundaries            |
| T10       | 2              | 6              | -1             | 7        | invalid |                          |
| T11       | 9              | 18             | 30             | 57       | valid   |                          |
| T12       | 12             | 27             | 31             | 70       | invalid |                          |
| T13       | invalid string | 14             | 20             |          | invalid | invalid classes          |
| T14       | 11             | invalid string | 23             |          | invalid |                          |
| T15       | 9              | 19             | invalid string |          | invalid |                          |
| T16       | 23             | 23             | 22             | 68       | valid   | FN + MN + LN restriction |
| T17       | 23             | 23             | 23             | 69       | invalid |                          |

### Notes:

We simplified the output by basically returning "valid" or "invalid". You might also wanna check the final name that was generated.
Test cases with strings of length -1 might then not be possible.
