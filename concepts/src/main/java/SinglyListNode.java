public final class SinglyListNode extends ListNode<SinglyListNode> {
    public static final SinglyListNode ZERO = new SinglyListNode(0);

    public SinglyListNode() {
        super(0);
    }

    public SinglyListNode(int value) {
        super(value);
    }

    public SinglyListNode(int value, SinglyListNode next) {
        super(value);
        this.next = next;
    }

    public static SinglyListNode of(int... values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("Can't be empty.");
        }
        SinglyListNode head = new SinglyListNode(values[0]);
        SinglyListNode next = head;
        for (int i = 1; i < values.length; i++) {
            next.next = new SinglyListNode(values[i]);
            next = next.next;
        }
        return head;
    }
}
