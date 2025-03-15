package concepts;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class DoublyListNodeTest {
    @Test
    public void nullValues() {
        assertThat(DoublyListNode.of()).isNull();
        assertThat(DoublyListNode.of((int[]) null)).isNull();
    }

    @Test
    public void sum() {
        assertThat(
            DoublyListNode
                .of(1, 3, 5, 7)
                .stream()
                .mapToInt(n -> n.value)
                .sum()
        ).isEqualTo(16);
    }

    @Test
    public void traverse() {
        DoublyListNode node = DoublyListNode.of(2, 4, 6, 8);
        assertThat(node.value).isEqualTo(2);

        node = node.next.next;
        assertThat(node.value).isEqualTo(6);

        node = node.prev;
        assertThat(node.value).isEqualTo(4);

        node = node.next.next;
        assertThat(node.value).isEqualTo(8);
    }
}
