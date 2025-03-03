[&larr; Return](https://hanggrian.github.io/grind-leetcode/)

# 27. Remove Element

> Given an integer array `nums` and an integer `val`, remove all occurrences of
  `val` in `nums` in-place. The order of the elements may be changed. Then
  return *the number of elements in `nums` which are not equal to `val`.*
>
> Consider the number of elements in `nums` which are not equal to `val` be `k`,
  to get accepted, you need to do the following things:
>
> - Change the array `nums` such that the first `k` elements of `nums` contain
    the elements which are not equal to `val`. The remaining elements of `nums`
    are not important as well as the size of `nums`.
> - Return `k`.
>
> **Custom Judge:**
>
> > ```java
> > int[] nums = [...]; // Input array
> > int val = ...; // Value to remove
> > int[] expectedNums = [...]; // The expected answer with correct length.
> >                             // It is sorted with no values equaling val.
> >
> > int k = removeElement(nums, val); // Calls your implementation
> >
> > assert k == expectedNums.length;
> > sort(nums, 0, k); // Sort the first k elements of nums
> > for (int i = 0; i < actualLength; i++) {
> >     assert nums[i] == expectedNums[i];
> > }
> > ```
>
> The judge will test your solution with the following code:
> If all assertions pass, then your solution will be **accepted.**

- [Problem](https://leetcode.com/problems/remove-element/)
- Solutions
  - [Groovy](https://github.com/hanggrian/grind-leetcode/blob/main/groovy/src/main/groovy/problems1_100/RemoveElement.groovy)
  - [Java](https://github.com/hanggrian/grind-leetcode/blob/main/java/src/main/java/problems1_100/RemoveElement.java)
  - [JavaScript](https://github.com/hanggrian/grind-leetcode/blob/main/javascript/src/problems1_100/remove-element.js)
  - [Kotlin](https://github.com/hanggrian/grind-leetcode/blob/main/kotlin/src/main/kotlin/problems1_100/RemoveElement.kt)
  - [Python](https://github.com/hanggrian/grind-leetcode/blob/main/python/src/problems1_100/remove_element.py)
  - [TypeScript](https://github.com/hanggrian/grind-leetcode/blob/main/typescript/src/problems1_100/remove-element.ts)

![](https://github.com/hanggrian/grind-leetcode/raw/assets/problems1_100/remove-element1.svg)

![](https://github.com/hanggrian/grind-leetcode/raw/assets/problems1_100/remove-element2.svg)

![](https://github.com/hanggrian/grind-leetcode/raw/assets/problems1_100/remove-element3.svg)

![](https://github.com/hanggrian/grind-leetcode/raw/assets/problems1_100/remove-element4.svg)
