package concepts

import com.google.common.truth.Truth.assertThat
import kotlin.test.Test

class DoublyListNodeTest {
    @Test
    fun nullValues() = assertThat(DoublyListNode.of()).isNull()

    @Test
    fun sum() {
        assertThat(
            DoublyListNode
                .of(1, 3, 5, 7)!!
                .sumOf { it.value },
        ).isEqualTo(16)
    }

    @Test
    fun traverse() {
        var node: DoublyListNode? = DoublyListNode.of(2, 4, 6, 8)!!
        assertThat(node!!.value).isEqualTo(2)

        node = node.next?.next
        assertThat(node!!.value).isEqualTo(6)

        node = node.next
        assertThat(node!!.value).isEqualTo(8)
    }
}
