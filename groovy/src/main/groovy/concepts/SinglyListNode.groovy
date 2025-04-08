package concepts

final class SinglyListNode extends ListNode<SinglyListNode> {
    static final SinglyListNode ZERO = new SinglyListNode(0)

    SinglyListNode() {
        super(0)
    }

    SinglyListNode(int val) {
        super(val)
    }

    SinglyListNode(int val, SinglyListNode next) {
        super(val)
        this.next = next
    }

    static SinglyListNode of(int ... vals) {
        if (!vals || vals.length == 0) {
            return null
        }
        var head = new SinglyListNode(vals[0])
        var next = head
        for (var i = 1; i < vals.length; i++) {
            next.next = new SinglyListNode(vals[i])
            next = next.next
        }
        return head
    }
}
