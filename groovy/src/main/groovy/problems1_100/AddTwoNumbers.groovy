package problems1_100

import concepts.SinglyListNode

enum AddTwoNumbers {
    DEFAULT{
        @Override
        SinglyListNode addTwoNumbers(SinglyListNode l1, SinglyListNode l2) {
            SinglyListNode root = new SinglyListNode()
            SinglyListNode next1 = l1
            SinglyListNode next2 = l2
            SinglyListNode node = root
            int carry = 0
            while (next1 != null || next2 != null) {
                // calculate total and carry
                int value = carry
                if (next1 != null) {
                    value += next1.value
                    next1 = next1.next
                }
                if (next2 != null) {
                    value += next2.value
                    next2 = next2.next
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
