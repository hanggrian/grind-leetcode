import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SinglyListNodeTest {
    @Test
    public void sum() {
        assertEquals(
            0,
            SinglyListNode.ZERO
                .stream()
                .mapToInt(n -> n.value)
                .sum()
        );
        assertEquals(
            16,
            SinglyListNode
                .of(1, 3, 5, 7)
                .stream()
                .mapToInt(n -> n.value)
                .sum()
        );
    }

    @Test
    public void traverse() {
        ListNode<SinglyListNode> node = SinglyListNode.of(2, 4, 6, 8);
        assertEquals(2, node.value);
        node = node.next.next;
        assertEquals(6, node.value);
        node = node.next;
        assertEquals(8, node.value);
    }
}
