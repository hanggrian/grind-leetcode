package concepts

final class DoublyListNode extends ListNode<DoublyListNode> {
    DoublyListNode prev

    DoublyListNode() {
        super(0)
    }

    DoublyListNode(int value) {
        super(value)
    }

    DoublyListNode(int value, DoublyListNode next) {
        super(value)
        this.next = next
    }

    DoublyListNode(int value, DoublyListNode next, DoublyListNode prev) {
        super(value)
        this.next = next
        this.prev = prev
    }

    static DoublyListNode of(int ... values) {
        if (values == null || values.length == 0) {
            return null
        }
        final DoublyListNode head = new DoublyListNode(values[0])
        DoublyListNode prev = null
        DoublyListNode next = head
        for (int i = 1; i < values.length; i++) {
            final DoublyListNode temp = next

            next.prev = prev
            next.next = new DoublyListNode(values[i])
            next = next.next

            prev = temp
        }
        return head
    }
}
