import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoublyListNodeTest {
    @Test
    public void sum() {
        assertEquals(
            16,
            DoublyListNode
                .of(1, 3, 5, 7)
                .stream()
                .mapToInt(n -> n.value)
                .sum()
        );
    }

    @Test
    public void traverse() {
        DoublyListNode node = DoublyListNode.of(2, 4, 6, 8);
        assertEquals(2, node.value);
        node = node.next.next;
        assertEquals(6, node.value);
        node = node.prev;
        assertEquals(4, node.value);
        node = node.next.next;
        assertEquals(8, node.value);
    }
}
