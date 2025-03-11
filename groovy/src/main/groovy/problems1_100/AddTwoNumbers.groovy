package problems1_100

import concepts.SinglyListNode

enum AddTwoNumbers {
    DEFAULT{
        @Override
        SinglyListNode addTwoNumbers(SinglyListNode l1, SinglyListNode l2) {
            var root = new SinglyListNode()
            var node = root
            var carry = 0
            while (l1 != null || l2 != null) {
                // calculate total and carry
                var value = carry
                if (l1 != null) {
                    value += l1.value
                    l1 = l1.next
                }
                if (l2 != null) {
                    value += l2.value
                    l2 = l2.next
                }
                carry = (value / 10) as int

                // create list
                node.next = new SinglyListNode(value % 10)
                node = node.next
            }

            // create remaining carry
            if (carry > 0) {
                node.next = new SinglyListNode(carry)
            }
            return root.next
        }
    }

    abstract SinglyListNode addTwoNumbers(SinglyListNode l1, SinglyListNode l2)
}
