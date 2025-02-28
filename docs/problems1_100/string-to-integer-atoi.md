[&larr; Return](https://hanggrian.github.io/grind-leetcode/)

# 8. String to Integer (Atoi)

> Implement the `myAtoi(string s)` function, which converts a string to a 32-bit
  signed integer.
>
> The algorithm for `myAtoi(string s)`` is as follows:
>
> 1.  **Whitespace:** Ignore any leading whitespace (`" "`).
> 1.  **Signedness:** Determine the sign by checking if the next character is
      `'-'` or `'+'`, assuming positivity if neither present.
> 1.  **Conversion:** Read the integer by skipping leading zeros until a
      non-digit character is encountered or the end of the string is reached. If
      no digits were read, then the result is 0.
> 1.  **Rounding:** If the integer is out of the 32-bit signed integer range
      `[-2`<sup>`31`</sup>`, 2`<sup>`31`</sup>` - 1]`, then round the integer to
      remain in the range. Specifically, integers less than `-2`<sup>`31`</sup>
      should be rounded to `-2`<sup>`31`</sup>, and integers greater than
      `2`<sup>`31`</sup>` - 1` should be rounded to `2`<sup>`31`</sup>` - 1`.
>
> Return the integer as the final result.

- [Problem](https://leetcode.com/problems/string-to-integer-atoi/)
- Solutions
  - [Groovy](https://github.com/hanggrian/grind-leetcode/blob/main/groovy/src/main/groovy/problems1_100/StringToIntegerAtoi.groovy)
  - [Java](https://github.com/hanggrian/grind-leetcode/blob/main/java/src/main/java/problems1_100/StringToIntegerAtoi.java)
  - [Kotlin](https://github.com/hanggrian/grind-leetcode/blob/main/kotlin/src/main/kotlin/problems1_100/StringToIntegerAtoi.kt)
  - [Python](https://github.com/hanggrian/grind-leetcode/blob/main/python/src/problems1_100/string_to_integer_atoi.py)

![](https://github.com/hanggrian/grind-leetcode/raw/assets/problems1_100/string-to-integer-atoi1.svg)

![](https://github.com/hanggrian/grind-leetcode/raw/assets/problems1_100/string-to-integer-atoi2.svg)

![](https://github.com/hanggrian/grind-leetcode/raw/assets/problems1_100/string-to-integer-atoi3.svg)

![](https://github.com/hanggrian/grind-leetcode/raw/assets/problems1_100/string-to-integer-atoi4.svg)
