package concepts;

public final class DoublyListNode extends ListNode<DoublyListNode> {
    public DoublyListNode prev;

    public DoublyListNode() {
        super(0);
    }

    public DoublyListNode(int value) {
        super(value);
    }

    public DoublyListNode(int value, DoublyListNode next) {
        super(value);
        this.next = next;
    }

    public DoublyListNode(int value, DoublyListNode next, DoublyListNode prev) {
        super(value);
        this.next = next;
        this.prev = prev;
    }

    public static DoublyListNode of(int... vals) {
        if (vals == null || vals.length == 0) {
            return null;
        }
        final DoublyListNode head = new DoublyListNode(vals[0]);
        DoublyListNode prev = null;
        DoublyListNode next = head;
        for (int i = 1; i < vals.length; i++) {
            final DoublyListNode temp = next;

            next.prev = prev;
            next.next = new DoublyListNode(vals[i]);
            next = next.next;

            prev = temp;
        }
        return head;
    }
}
