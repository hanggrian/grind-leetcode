[&larr; Return](https://hanggrian.github.io/grind-leetcode/)

# 141. Linked List Cycle

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
  - [Kotlin](https://github.com/hanggrian/grind-leetcode/blob/main/kotlin/src/main/kotlin/problems101_200/LinkedListCycle.kt)
  - [Python](https://github.com/hanggrian/grind-leetcode/blob/main/python/src/problems101_200/linked_list_cycle.py)

## Remember visits

![](https://github.com/hanggrian/grind-leetcode/raw/assets/problems101_200/linked-list-cycle1_1.svg)

![](https://github.com/hanggrian/grind-leetcode/raw/assets/problems101_200/linked-list-cycle1_2.svg)

## Fast slow pointers

![](https://github.com/hanggrian/grind-leetcode/raw/assets/problems101_200/linked-list-cycle2_1.svg)

![](https://github.com/hanggrian/grind-leetcode/raw/assets/problems101_200/linked-list-cycle2_2.svg)

![](https://github.com/hanggrian/grind-leetcode/raw/assets/problems101_200/linked-list-cycle2_3.svg)
