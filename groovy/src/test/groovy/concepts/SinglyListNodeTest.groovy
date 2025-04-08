package concepts

import org.junit.Test

import static com.google.common.truth.Truth.assertThat

class SinglyListNodeTest {
    @Test
    void nullValues() {
        assertThat(SinglyListNode.of()).isNull()
        assertThat(SinglyListNode.of((int[]) null)).isNull()
    }

    @Test
    void sum() {
        assertThat(
            SinglyListNode.ZERO
                .stream()
                .mapToInt(n -> n.val)
                .sum(),
        ).isEqualTo(0)
        assertThat(
            SinglyListNode
                .of(1, 3, 5, 7)
                .stream()
                .mapToInt(n -> n.val)
                .sum(),
        ).isEqualTo(16)
    }

    @Test
    void traverse() {
        var node = SinglyListNode.of(2, 4, 6, 8)
        assertThat(node.val).isEqualTo(2)

        node = node.next.next
        assertThat(node.val).isEqualTo(6)

        node = node.next
        assertThat(node.val).isEqualTo(8)
    }
}
