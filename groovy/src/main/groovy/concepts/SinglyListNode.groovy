package concepts

final class SinglyListNode extends ListNode<SinglyListNode> {
    public static final SinglyListNode ZERO = new SinglyListNode(0)

    SinglyListNode() {
        super(0)
    }

    SinglyListNode(int value) {
        super(value)
    }

    SinglyListNode(int value, SinglyListNode next) {
        super(value)
        this.next = next
    }

    static SinglyListNode of(int ... values) {
        if (values == null || values.length == 0) {
            return null
        }
        SinglyListNode head = new SinglyListNode(values[0])
        SinglyListNode next = head
        for (var i = 1; i < values.length; i++) {
            next.next = new SinglyListNode(values[i])
            next = next.next
        }
        return head
    }
}
