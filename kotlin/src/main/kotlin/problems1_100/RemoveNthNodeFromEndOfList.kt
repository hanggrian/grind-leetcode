package problems1_100

import concepts.SinglyListNode

enum class RemoveNthNodeFromEndOfList {
    DEFAULT {
        override fun removeNthFromEnd(head: SinglyListNode?, n: Int): SinglyListNode? {
            if (head?.next == null && n == 1) {
                return null
            }
            val root = SinglyListNode(0, head)
            var left: SinglyListNode? = root
            var right: SinglyListNode? = root
            for (i in 0 until n) {
                left = left!!.next
            }
            while (left!!.next != null) {
                left = left.next
                right = right!!.next
            }
            right!!.next = right.next!!.next
            return root.next
        }
    },
    ;

    abstract fun removeNthFromEnd(head: SinglyListNode?, n: Int): SinglyListNode?
}
