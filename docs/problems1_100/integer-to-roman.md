[&larr; Return](https://hanggrian.github.io/grind-leetcode/)

# 12. Integer to Roman

> Seven different symbols represent Roman numerals with the following values:
>
> Symbol | Value
> --- | ---
> I | 1
> V | 5
> X | 10
> L | 50
> C | 100
> D | 500
> M | 1000
>
> Roman numerals are formed by appending the conversions of decimal place values
  from highest to lowest. Converting a decimal place value into a Roman numeral
  has the following rules:
>
> - If the value does not start with 4 or 9, select the symbol of the maximal
    value that can be subtracted from the input, append that symbol to the
    result, subtract its value, and convert the remainder to a Roman numeral.
> - If the value starts with 4 or 9 use the subtractive form representing one
    symbol **subtracted from** the following symbol, for example, 4 is 1 (`I`)
    less than 5 (`V`): `IV` and 9 is 1 (`I`) less than 10 (`X`): `IX`. Only the
    following subtractive forms are used: 4 (`IV`), 9 (`IX`), 40 (`XL`), 90
    (`XC`), 400 (`CD`) and 900 (`CM`).
> - Only powers of 10 (`I`, `X`, `C`, `M`) can be appended consecutively at most
    3 times to represent multiples of 10. You cannot append 5 (`V`), 50 (`L`),
    or 500 (`D`) multiple times. If you need to append a symbol 4 times use the
    **subtractive form.**
>
> Given an integer, convert it to a Roman numeral.

- [Problem](https://leetcode.com/problems/integer-to-roman/)
- Solutions
  - [Groovy](https://github.com/hanggrian/grind-leetcode/blob/main/groovy/src/main/groovy/problems1_100/IntegerToRoman.groovy)
  - [Java](https://github.com/hanggrian/grind-leetcode/blob/main/java/src/main/java/problems1_100/IntegerToRoman.java)
  - [JavaScript](https://github.com/hanggrian/grind-leetcode/blob/main/javascript/src/problems1_100/integer-to-roman.js)
  - [Kotlin](https://github.com/hanggrian/grind-leetcode/blob/main/kotlin/src/main/kotlin/problems1_100/IntegerToRoman.kt)
  - [Python](https://github.com/hanggrian/grind-leetcode/blob/main/python/src/problems1_100/integer_to_roman.py)
  - [TypeScript](https://github.com/hanggrian/grind-leetcode/blob/main/typescript/src/problems1_100/integer-to-roman.ts)

![](https://github.com/hanggrian/grind-leetcode/raw/assets/problems1_100/integer-to-roman1.svg)

![](https://github.com/hanggrian/grind-leetcode/raw/assets/problems1_100/integer-to-roman2.svg)

![](https://github.com/hanggrian/grind-leetcode/raw/assets/problems1_100/integer-to-roman3.svg)

![](https://github.com/hanggrian/grind-leetcode/raw/assets/problems1_100/integer-to-roman4.svg)

![](https://github.com/hanggrian/grind-leetcode/raw/assets/problems1_100/integer-to-roman5.svg)
