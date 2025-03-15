package problems101_200

import concepts.SinglyListNode

enum class LinkedListCycle {
    REMEMBER_VISITS {
        override fun hasCycle(head: SinglyListNode?): Boolean {
            // visited nodes
            val visits = hashSetOf<SinglyListNode>()
            for (node in head!!) {
                if (!visits.add(node)) {
                    return true
                }
            }
            return false
        }
    },
    FAST_SLOW_POINTERS {
        override fun hasCycle(head: SinglyListNode?): Boolean {
            if (head?.next == null) {
                return false
            }
            var slow = head.next
            var fast = head.next!!.next
            while (fast != null && fast.hasNext() && slow !== fast) {
                slow = slow!!.next
                fast = fast.next!!.next
            }
            return slow === fast
        }
    },
    ;

    abstract fun hasCycle(head: SinglyListNode?): Boolean
}
