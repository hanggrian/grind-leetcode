package concepts

import com.google.common.truth.Truth.assertThat
import kotlin.test.Test

class TreeNodeTest {
    @Test
    fun nullValues() = assertThat(TreeNode.of()).isNull()

    @Test
    fun traverse() {
        val node = TreeNode.of(1, 2, 3, 4, 5, 6, 7)
        assertThat(node!!.value).isEqualTo(1)

        var left = node.left
        assertThat(left!!.value).isEqualTo(2)

        left = left.left
        assertThat(left!!.value).isEqualTo(4)

        var right = node.right
        assertThat(right!!.value).isEqualTo(3)

        right = right.right
        assertThat(right!!.value).isEqualTo(7)
    }
}
