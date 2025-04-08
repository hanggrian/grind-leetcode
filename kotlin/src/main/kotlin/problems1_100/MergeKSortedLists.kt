package problems1_100

import concepts.SinglyListNode

enum class MergeKSortedLists {
    DEFAULT {
        override fun mergeKLists(lists: Array<SinglyListNode?>): SinglyListNode? {
            val nodes =
                lists
                    .filterNotNull()
                    .toMutableList()
            if (nodes.isEmpty()) {
                return null
            }

            val root = SinglyListNode()
            var current = root
            while (nodes.isNotEmpty()) {
                // find lowest
                val lowest =
                    nodes
                        .minBy { it.`val` }

                // append lowest to current
                current.next = SinglyListNode(lowest.`val`)
                current = current.next!!

                // remove the lowest node within list
                if (lowest.next == null) {
                    nodes.remove(lowest)
                    continue
                }
                val next = lowest.next!!
                lowest.`val` = next.`val`
                lowest.next = next.next
            }
            return root.next
        }
    },
    ;

    abstract fun mergeKLists(lists: Array<SinglyListNode?>): SinglyListNode?
}
