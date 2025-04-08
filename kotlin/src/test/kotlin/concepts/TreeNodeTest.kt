package concepts

import com.google.common.truth.Truth.assertThat
import kotlin.test.Test

class TreeNodeTest {
    @Test
    fun nullValues() = assertThat(TreeNode.of()).isNull()

    @Test
    fun traverse() {
        val node = TreeNode.of(1, 2, 3, 4, 5, 6, 7)
        assertThat(node!!.`val`).isEqualTo(1)

        var left = node.left
        assertThat(left!!.`val`).isEqualTo(2)

        left = left.left
        assertThat(left!!.`val`).isEqualTo(4)

        var right = node.right
        assertThat(right!!.`val`).isEqualTo(3)

        right = right.right
        assertThat(right!!.`val`).isEqualTo(7)
    }
}
