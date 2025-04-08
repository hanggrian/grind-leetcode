package problems1_100

import concepts.SinglyListNode

enum class SwapNodesInPairs {
    DEFAULT {
        override fun swapPairs(head: SinglyListNode?): SinglyListNode? {
            val root = SinglyListNode(0, head)
            var current = root
            while (current.next?.next != null) {
                val node1 = current.next!!
                val node2 = current.next!!.next!!
                node1.next = node2.next
                current.next = node2
                current.next!!.next = node1
                current = current.next!!.next!!
            }
            return root.next
        }
    },
    ;

    abstract fun swapPairs(head: SinglyListNode?): SinglyListNode?
}
