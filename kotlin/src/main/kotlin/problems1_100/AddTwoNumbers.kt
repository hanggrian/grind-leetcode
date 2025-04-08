package problems1_100

import concepts.SinglyListNode

enum class AddTwoNumbers {
    DEFAULT {
        override fun addTwoNumbers(l1: SinglyListNode?, l2: SinglyListNode?): SinglyListNode? {
            var l1 = l1
            var l2 = l2

            val root = SinglyListNode()
            var node = root
            var carry = 0
            while (l1 != null || l2 != null) {
                // calculate total and carry
                var value = carry
                if (l1 != null) {
                    value += l1.`val`
                    l1 = l1.next
                }
                if (l2 != null) {
                    value += l2.`val`
                    l2 = l2.next
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
