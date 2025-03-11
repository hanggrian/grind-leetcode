package problems101_200

import concepts.SinglyListNode

enum class SortList {
    DEFAULT {
        override fun sortList(head: SinglyListNode?): SinglyListNode? {
            if (head?.next == null) {
                return head
            }
            val mid = split(head)
            return merge(
                sortList(head),
                sortList(mid),
            )
        }

        fun merge(node1: SinglyListNode?, node2: SinglyListNode?): SinglyListNode? {
            var node1 = node1
            var node2 = node2

            val root = SinglyListNode()
            var current = root
            while (node1 != null && node2 != null) {
                if (node1.value < node2.value) {
                    current.next = node1
                    node1 = node1.next
                } else {
                    current.next = node2
                    node2 = node2.next
                }
                current = current.next!!
            }
            if (node1 != null) {
                current.next = node1
            } else if (node2 != null) {
                current.next = node2
            }
            return root.next
        }

        fun split(node: SinglyListNode?): SinglyListNode? {
            var slowPrev: SinglyListNode? = null
            var slow = node
            var fast = node
            while (fast?.next != null) {
                slowPrev = slow
                slow = slow!!.next
                fast = fast.next!!.next
            }
            slowPrev!!.next = null
            return slow
        }
    },
    ;

    abstract fun sortList(head: SinglyListNode?): SinglyListNode?
}
