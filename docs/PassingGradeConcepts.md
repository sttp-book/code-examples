# Passing Grade

> **Requirement**: The final grade of a student is calculated as follows:
> * `1 <= grade < 5` => **`F`**
> * `5 <= grade < 6` => **`E`**
> * `6 <= grade < 7` => **`D`**
> * `7 <= grade < 8` => **`C`**
> * `8 <= grade < 9` => **`B`**
> * `9 <= grade <= 10` => **`A`**
> 
> The system does not allow for invalid grades (e.g. 0.9, 10.5)

## Variables
| Variable | type | range | remark |
| -------- | ---- | ----- | ------- |
| Grade | float | [1, 10] | no one gets a 0 |
| Concept | Enumerate | [F, E, D, B, C, A] | output variable |

### Dependency among variables
There are no dependencies among the input variables, since we only have one variable.

The grade is used to decide the concept.

## Equivalence Partitioning/Boundary Analysis
| Variable | Equivalence classes | Invalid classes | Boundaries |
| -------- | ------------------- | --------------- | ---------- |
| Grade | [1,5[ | | |
| | | | 1 |
| | | | 5 |
| | | | 4.9 |
| | [5,6[ | | |
| | | | 4.9 |
| | | | 5 |
| | | | 6 |
| | | | 5.9 |
| | [6,7[ | | |
| | | | 5.9 |
| | | | 6 |
| | | | 7 |
| | | | 6.9 |
| | [7,8[ | | |
| | | | 6.9 |
| | | | 7 |
| | | | 8 |
| | | | 7.9 |
| | [8,9[ | | |
| | | | 7.9 |
| | | | 8 |
| | | | 9 |
| | | | 8.9 |
| | [9,10] | | |
| | | | 8.9 |
| | | | 9 |
| | | | 10 |



## Strategy
Test all boundaries, yielding 12 tests.


| Test case | Grade | Concept (output) |
| --------- | ----- | ---------------- |
| T1 | 1 | F |
| T2 | 4.9 | F |
| T3 | 5 | E |
| T4 | 5.9 | E |
| T5 | 6 | D |
| T6 | 6.9 | D |
| T7 | 7 | C |
| T8 | 7.9 | C |
| T9 | 8 | B |
| T10 | 8.9 | B |
| T11 | 9 | A |
| T12 | 10 | A |
