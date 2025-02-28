package problems1_100

import concepts.SinglyListNode

enum class AddTwoNumbers {
    DEFAULT {
        override fun addTwoNumbers(l1: SinglyListNode?, l2: SinglyListNode?): SinglyListNode? {
            val root = SinglyListNode()
            var next1 = l1
            var next2 = l2
            var node = root
            var carry = 0
            while (next1 != null || next2 != null) {
                // calculate total and carry
                var value = carry
                if (next1 != null) {
                    value += next1.value
                    next1 = next1.next
                }
                if (next2 != null) {
                    value += next2.value
                    next2 = next2.next
                }
                carry = value / 10

                // create list
                node.next = SinglyListNode(value % 10)
                node = node.next!!
            }
            // create remaining carry
            if (carry > 0) {
                node.next = SinglyListNode(carry)
            }
            return root.next
        }
    },
    ;

    abstract fun addTwoNumbers(l1: SinglyListNode?, l2: SinglyListNode?): SinglyListNode?
}
