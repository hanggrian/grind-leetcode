package concepts;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class TreeNodeTest {
    @Test
    public void nullValues() {
        assertThat(TreeNode.of()).isNull();
        assertThat(TreeNode.of((Integer[]) null)).isNull();
    }

    @Test
    public void traverse() {
        TreeNode node = TreeNode.of(1, 2, 3, 4, 5, 6, 7);
        assertThat(node.value).isEqualTo(1);

        TreeNode left = node.left;
        assertThat(left.value).isEqualTo(2);

        left = left.left;
        assertThat(left.value).isEqualTo(4);

        TreeNode right = node.right;
        assertThat(right.value).isEqualTo(3);

        right = right.right;
        assertThat(right.value).isEqualTo(7);
    }
}
