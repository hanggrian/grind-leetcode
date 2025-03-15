package concepts

import com.google.common.truth.Truth.assertThat
import kotlin.test.Test

class SinglyListNodeTest {
    @Test
    fun nullValues() = assertThat(SinglyListNode.of()).isNull()

    @Test
    fun sum() {
        assertThat(
            SinglyListNode.ZERO
                .sumOf { it.value },
        ).isEqualTo(0)
        assertThat(
            SinglyListNode
                .of(1, 3, 5, 7)!!
                .sumOf { it.value },
        ).isEqualTo(16)
    }

    @Test
    fun traverse() {
        var node: SinglyListNode? = SinglyListNode.of(2, 4, 6, 8)!!
        assertThat(node!!.value).isEqualTo(2)

        node = node.next?.next
        assertThat(node!!.value).isEqualTo(6)

        node = node.next
        assertThat(node!!.value).isEqualTo(8)
    }
}
