[&larr; Return](https://hanggrian.github.io/grind-leetcode/)

# 26. Remove Duplicates from Sorted Array<sup style="color: rgb(0, 184, 163);">Easy</sup>

> Given an integer array `nums` sorted in **non-decreasing order,** remove the
  duplicates in-place such that each unique element appears only **once.** The
  **relative order** of the elements should be kept the **same.** Then return
  *the number of unique elements in `nums`.*
>
> Consider the number of unique elements of `nums` to be `k`, to get accepted,
  you need to do the following things:
>
> - Change the array `nums` such that the first `k` elements of `nums` contain
    the unique elements in the order they were present in `nums` initially. The
    remaining elements of `nums` are not important as well as the size of
    `nums`.
> - Return `k`.
>
> **Custom Judge:**
>
> The judge will test your solution with the following code:
>
> > ```java
> > int[] nums = [...]; // Input array
> > int[] expectedNums = [...]; // The expected answer with correct length
> >
> > int k = removeDuplicates(nums); // Calls your implementation
> >
> > assert k == expectedNums.length;
> > for (int i = 0; i < k; i++) {
> >     assert nums[i] == expectedNums[i];
> > }
> > ```
>
> If all assertions pass, then your solution will be **accepted.**

- [Problem](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
- Solutions
  - [Groovy](https://github.com/hanggrian/grind-leetcode/blob/main/groovy/src/main/groovy/problems1_100/RemoveDuplicatesfromSortedArray.groovy)
  - [Java](https://github.com/hanggrian/grind-leetcode/blob/main/java/src/main/java/problems1_100/RemoveDuplicatesfromSortedArray.java)
  - [JavaScript](https://github.com/hanggrian/grind-leetcode/blob/main/javascript/src/problems1_100/remove-duplicates-from-sorted-array.js)
  - [Kotlin](https://github.com/hanggrian/grind-leetcode/blob/main/kotlin/src/main/kotlin/problems1_100/RemoveDuplicatesfromSortedArray.kt)
  - [Python](https://github.com/hanggrian/grind-leetcode/blob/main/python/src/problems1_100/remove_duplicates_from_sorted_array.py)
  - [TypeScript](https://github.com/hanggrian/grind-leetcode/blob/main/typescript/src/problems1_100/remove-duplicates-from-sorted-array.ts)

## Create copy

1.  ![](https://github.com/hanggrian/grind-leetcode/raw/assets/problems1_100/remove-duplicates-from-sorted-array1_1.svg)
1.  ![](https://github.com/hanggrian/grind-leetcode/raw/assets/problems1_100/remove-duplicates-from-sorted-array1_2.svg)

## Single pass

1.  ![](https://github.com/hanggrian/grind-leetcode/raw/assets/problems1_100/remove-duplicates-from-sorted-array2_1.svg)
1.  ![](https://github.com/hanggrian/grind-leetcode/raw/assets/problems1_100/remove-duplicates-from-sorted-array2_2.svg)
1.  ![](https://github.com/hanggrian/grind-leetcode/raw/assets/problems1_100/remove-duplicates-from-sorted-array2_3.svg)
