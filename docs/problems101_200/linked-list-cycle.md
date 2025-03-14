[&larr; Return](https://hanggrian.github.io/grind-leetcode/)

# 141. Linked List Cycle<sup style="color: rgb(0, 184, 163);">Easy</sup>

> Given `head`, the head of a linked list, determine if the linked list has a
  cycle in it.
>
> There is a cycle in a linked list if there is some node in the list that can
  be reached again by continuously following the `next` pointer. Internally,
  `pos` is used to denote the index of the node that tail's next pointer is
  connected to. **Note that `pos` is not passed as a parameter.**
>
> Return `true` *if there is a cycle in the linked list.* Otherwise, return
  `false`.

- [Problem](https://leetcode.com/problems/linked-list-cycle/)
- Solutions
  - [Groovy](https://github.com/hanggrian/grind-leetcode/blob/main/groovy/src/main/groovy/problems101_200/LinkedListCycle.groovy)
  - [Java](https://github.com/hanggrian/grind-leetcode/blob/main/java/src/main/java/problems101_200/LinkedListCycle.java)
  - [JavaScript](https://github.com/hanggrian/grind-leetcode/blob/main/javascript/src/problems101_200/linked-list-cycle.js)
  - [Kotlin](https://github.com/hanggrian/grind-leetcode/blob/main/kotlin/src/main/kotlin/problems101_200/LinkedListCycle.kt)
  - [Python](https://github.com/hanggrian/grind-leetcode/blob/main/python/src/problems101_200/linked_list_cycle.py)
  - [TypeScript](https://github.com/hanggrian/grind-leetcode/blob/main/typescript/src/problems101_200/linked-list-cycle.ts)

## Remember visits

1.  ![](https://github.com/hanggrian/grind-leetcode/raw/assets/problems101_200/linked-list-cycle1_1.svg)
1.  ![](https://github.com/hanggrian/grind-leetcode/raw/assets/problems101_200/linked-list-cycle1_2.svg)
1.  ![](https://github.com/hanggrian/grind-leetcode/raw/assets/problems101_200/linked-list-cycle1_3.svg)

## Fast slow pointers

1.  ![](https://github.com/hanggrian/grind-leetcode/raw/assets/problems101_200/linked-list-cycle2_1.svg)
1.  ![](https://github.com/hanggrian/grind-leetcode/raw/assets/problems101_200/linked-list-cycle2_2.svg)
