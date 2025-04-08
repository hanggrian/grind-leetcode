package concepts;

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

    public static SinglyListNode of(int... vals) {
        if (vals == null || vals.length == 0) {
            return null;
        }
        SinglyListNode head = new SinglyListNode(vals[0]);
        SinglyListNode next = head;
        for (int i = 1; i < vals.length; i++) {
            next.next = new SinglyListNode(vals[i]);
            next = next.next;
        }
        return head;
    }
}
