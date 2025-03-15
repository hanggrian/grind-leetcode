package problems101_200

import concepts.SinglyListNode

enum class LinkedListCycle2 {
    REMEMBER_VISITS {
        override fun detectCycle(head: SinglyListNode?): SinglyListNode? {
            // visited nodes
            val visits = hashSetOf<SinglyListNode>()
            var current: SinglyListNode? = head
            for (node in head!!) {
                if (!visits.add(node)) {
                    return current
                }
                current = current!!.next
            }
            return current
        }
    },
    FAST_SLOW_POINTERS {
        override fun detectCycle(head: SinglyListNode?): SinglyListNode? {
            if (head?.next == null) {
                return null
            }
            var slow = head.next
            var fast = head.next!!.next
            while (fast?.next != null) {
                slow = slow!!.next
                fast = fast.next!!.next
                if (slow === fast) {
                    break
                }
            }

            if (slow?.next == null) {
                return null
            }
            var left = head
            var right = slow
            while (left !== right) {
                left = left!!.next
                right = right!!.next
            }
            return left
        }
    },
    ;

    abstract fun detectCycle(head: SinglyListNode?): SinglyListNode?
}
