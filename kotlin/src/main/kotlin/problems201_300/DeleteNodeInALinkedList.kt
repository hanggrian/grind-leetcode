package problems201_300

import concepts.SinglyListNode

enum class DeleteNodeInALinkedList {
    DEFAULT {
        override fun deleteNode(node: SinglyListNode?) {
            if (node == null) {
                return
            }
            val next = node.next
            node.`val` = next!!.`val`
            node.next = next.next
        }
    },
    ;

    abstract fun deleteNode(node: SinglyListNode?)
}
