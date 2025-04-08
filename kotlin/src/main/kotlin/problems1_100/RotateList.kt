package problems1_100

import concepts.SinglyListNode

enum class RotateList {
    DEFAULT {
        override fun rotateRight(head: SinglyListNode?, k: Int): SinglyListNode? {
            if (head == null || k == 0) {
                return head
            }
            val root = SinglyListNode(0, head)

            // move left pointer, resetting if reached end
            var left: SinglyListNode? = root
            for (i in 0 until k) {
                left = left!!.next
                if (left == null) {
                    left = root.next
                }
            }

            // get n-th from last, keeping previous node
            var right: SinglyListNode? = root
            var previousRight: SinglyListNode? = null
            while (left != null) {
                left = left.next
                val nextRight = right!!.next
                previousRight = right
                right = nextRight
            }

            // sever middle, set last of right to start of left
            previousRight!!.next = null
            var lastRight = right
            while (lastRight?.next != null) {
                lastRight = lastRight.next
            }
            lastRight!!.next = root.next

            return right
        }
    },
    ;

    abstract fun rotateRight(head: SinglyListNode?, k: Int): SinglyListNode?
}
