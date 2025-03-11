package problems1_100

import concepts.SinglyListNode

enum class ReverseLinkedList2 {
    DEFAULT {
        override fun reverseBetween(head: SinglyListNode?, left: Int, right: Int): SinglyListNode? {
            var head = head

            if (left == right) {
                return head
            }

            val root = SinglyListNode(0, head)
            var centerStart: SinglyListNode? = root
            var centerStartPrevious: SinglyListNode? = null
            var centerEnd: SinglyListNode? = root
            for (i in 0 until right) {
                if (i < left) {
                    centerStartPrevious = centerStart
                    centerStart = centerStart!!.next
                }
                centerEnd = centerEnd!!.next
            }

            val excess = centerEnd!!.next
            centerStartPrevious!!.next = null
            centerEnd.next = null

            var current: SinglyListNode?
            if (left == 1) {
                head = reverse(centerStart)
                current = head
            } else {
                current = traverseUntilEnd(head!!)
                current.next = reverse(centerStart)
            }
            current = traverseUntilEnd(current!!)
            current.next = excess
            return head
        }

        fun traverseUntilEnd(node: SinglyListNode): SinglyListNode {
            var current = node
            while (current.next != null) {
                current = current.next!!
            }
            return current
        }

        fun reverse(node: SinglyListNode?): SinglyListNode? {
            var current = node
            var previous: SinglyListNode? = null
            while (current != null) {
                val temp = current.next
                current.next = previous
                previous = current
                current = temp
            }
            return previous
        }
    },
    ;

    abstract fun reverseBetween(head: SinglyListNode?, left: Int, right: Int): SinglyListNode?
}
