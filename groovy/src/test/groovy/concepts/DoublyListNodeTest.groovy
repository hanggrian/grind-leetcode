package concepts

import org.junit.Test

import static com.google.common.truth.Truth.assertThat

class DoublyListNodeTest {
    @Test
    void nullValues() {
        assertThat(DoublyListNode.of()).isNull()
        assertThat(DoublyListNode.of((int[]) null)).isNull()
    }

    @Test
    void sum() {
        assertThat(
            DoublyListNode
                .of(1, 3, 5, 7)
                .stream()
                .mapToInt(n -> n.val)
                .sum(),
        ).isEqualTo(16)
    }

    @Test
    void traverse() {
        var node = DoublyListNode.of(2, 4, 6, 8)
        assertThat(node.val).isEqualTo(2)

        node = node.next.next
        assertThat(node.val).isEqualTo(6)

        node = node.prev
        assertThat(node.val).isEqualTo(4)

        node = node.next.next
        assertThat(node.val).isEqualTo(8)
    }
}
