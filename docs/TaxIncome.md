# Tax Income

#### Requirement

*Your income is taxed as follows:*
> * `0 <= Income < 22100` → **Tax = `0.15 x Income`**
> * `22100 <= Income < 53500` → **Tax = `3315 + 0.28 * (Income - 22100)`**
> * `53500 <= Income < 115000` → **Tax = `12107 + 0.31 * (Income - 53500)`**
> * `115000 <= Income < 250000` → **Tax = `31172 + 0.36 * (Income - 115000)`**
> * `250000 <= Income` → **Tax = `79772 + 0.396 * (Income - 250000)`**

#### Variables, Types, Ranges

| Variable | Type | Range | Remark |
| -------- | ---- | ----- | ------ |
| Income | double | `[0, infinite]` | input |
| Tax | double | `[0, infinite]` | output |

#### Dependency between variables

*Income is used to calculate Tax*

#### Equivalence partitioning / Boundary analysis

| Variable | Equivalence classes | Invalid classes | Boundaries | Remark |
| -------- | ------------------- | --------------- | ---------- | ------ |
| Income | [0, 22100[ | | -1 | negative number |
|  | | | 0 | |
|  | | | 22099 | 22099.99 is better! |
|  | | | 22100 | |
| | | | | |
| | [22100,53500[ | | 22099 | |
|  | | | 22100 | |
|  | | | 53499 | |
|  | | | 53500 | |
| | | | | |
| | [53500,115000[ | | 53499 | |
|  | | | 53500 | |
|  | | | 114999 | |
|  | | | 115000 | |
| | | | | |
| | [115000,250000[ | | 114999 | |
|  | | | 115000 | |
|  | | | 250000 | |
|  | | | 250001 | |
| | | | | |
| | [250000, infinite[ | | 249999 | |
|  | | | 250000 | |

#### Strategy

*Test the boundaries (removing duplicates) → 10 tests*

#### Test cases

|  #  | Income | Tax |
| --- | ------ | --- |
| T1 | -1 | *CANNOT CALC TAX* |
| T2 | 0 | 0 |
| T3 | 22099 | 3314.85 |
| T4 | 22100 | 3315 |
| T5 | 53499 | 12106.72 |
| T6 | 53500 | 12107 |
| T7 | 114999 | 31171.69 |
| T8 | 115000 | 31172 |
| T9 | 249999 | 79771.64 |
| T10 | 250000 | 79772 |

#### Question

*Would you consider 22100 and 22099 a duplicate?*
