package problems101_200

import concepts.SinglyListNode

enum class ReorderList {
    DEFAULT {
        override fun reorderList(head: SinglyListNode?) {
            val mid = getMid(head)
            var right = reverse(mid)
            mid!!.next = null
            var left = head

            var current = SinglyListNode()
            var flag = true
            while (left != null && right != null) {
                if (flag) {
                    current.next = left
                    left = left.next
                } else {
                    current.next = right
                    right = right.next
                }
                current = current.next!!
                flag = !flag
            }
        }

        fun reverse(node: SinglyListNode?): SinglyListNode? {
            var previous: SinglyListNode? = null
            var current = node
            while (current != null) {
                val temp = current.next
                current.next = previous
                previous = current
                current = temp
            }
            return previous
        }

        fun getMid(node: SinglyListNode?): SinglyListNode? {
            var slow = node
            var fast = node
            while (fast?.next != null) {
                slow = slow!!.next
                fast = fast.next!!.next
            }
            return slow
        }
    },
    ;

    abstract fun reorderList(head: SinglyListNode?)
}
