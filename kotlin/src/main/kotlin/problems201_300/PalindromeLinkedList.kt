package problems201_300

import concepts.SinglyListNode

enum class PalindromeLinkedList {
    DEFAULT {
        override fun isPalindrome(head: SinglyListNode?): Boolean {
            var slow = head
            var fast = head
            while (fast?.next != null) {
                slow = slow!!.next
                fast = fast.next!!.next
            }

            var right = reverse(slow)
            slow!!.next = null // sever
            var left = head

            while (left != null && right != null) {
                if (left.`val` != right.`val`) {
                    return false
                }
                left = left.next
                right = right.next
            }
            return true
        }

        fun reverse(node: SinglyListNode?): SinglyListNode? {
            var previous: SinglyListNode? = null
            var current = node
            while (current != null) {
                val next = current.next
                current.next = previous
                previous = current
                current = next
            }
            return previous
        }
    },
    ;

    abstract fun isPalindrome(head: SinglyListNode?): Boolean
}
