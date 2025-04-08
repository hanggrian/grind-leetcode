package problems1_100

import concepts.SinglyListNode

enum class MergeTwoSortedLists {
    DEFAULT {
        override fun mergeTwoLists(l1: SinglyListNode?, l2: SinglyListNode?): SinglyListNode? {
            var l1 = l1
            var l2 = l2

            if (l1 == null) {
                return l2
            }
            if (l2 == null) {
                return l1
            }
            val root = SinglyListNode()
            var current = root

            // when both items are there
            while (l1 != null && l2 != null) {
                if (l1.`val` < l2.`val`) {
                    current.next = SinglyListNode(l1.`val`)
                    l1 = l1.next
                } else {
                    current.next = SinglyListNode(l2.`val`)
                    l2 = l2.next
                }
                current = current.next!!
            }

            // remaining
            current.next = l1 ?: l2
            return root.next
        }
    },
    ;

    abstract fun mergeTwoLists(l1: SinglyListNode?, l2: SinglyListNode?): SinglyListNode?
}
