package concepts

final class DoublyListNode extends ListNode<DoublyListNode> {
    DoublyListNode prev

    DoublyListNode() {
        super(0)
    }

    DoublyListNode(int val) {
        super(val)
    }

    DoublyListNode(int val, DoublyListNode next) {
        super(val)
        this.next = next
    }

    DoublyListNode(int val, DoublyListNode next, DoublyListNode prev) {
        super(val)
        this.next = next
        this.prev = prev
    }

    static DoublyListNode of(int ... vals) {
        if (!vals || vals.length == 0) {
            return null
        }
        final DoublyListNode head = new DoublyListNode(vals[0])
        var prev = null
        var next = head
        for (var i = 1; i < vals.length; i++) {
            final DoublyListNode temp = next

            next.prev = prev
            next.next = new DoublyListNode(vals[i])
            next = next.next

            prev = temp
        }
        return head
    }
}
