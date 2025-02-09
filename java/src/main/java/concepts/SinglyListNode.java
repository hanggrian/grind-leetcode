package concepts;

public final class SinglyListNode extends ListNode<SinglyListNode> {
    public static final SinglyListNode MAX = new SinglyListNode(Integer.MAX_VALUE);
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
        if (values == null || values.length == 0) {
            return null;
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
