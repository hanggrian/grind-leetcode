public enum AddTwoNumbers {
    DEFAULT {
        @Override
        public SinglyListNode addTwoNumbers(SinglyListNode l1, SinglyListNode l2) {
            SinglyListNode dummy = new SinglyListNode();
            SinglyListNode next1 = l1;
            SinglyListNode next2 = l2;
            SinglyListNode node = dummy;
            int carry = 0;
            while (next1 != null || next2 != null) {
                // calculate total and carry
                int val = carry;
                if (next1 != null) {
                    val += next1.value;
                    next1 = next1.next;
                }
                if (next2 != null) {
                    val += next2.value;
                    next2 = next2.next;
                }
                carry = val / 10;

                // create list
                node.next = new SinglyListNode(val % 10);
                node = node.next;
            }
            // create remaining carry
            if (carry > 0) {
                node.next = new SinglyListNode(carry);
            }
            return dummy.next;
        }
    };

    public abstract SinglyListNode addTwoNumbers(SinglyListNode l1, SinglyListNode l2);
}
