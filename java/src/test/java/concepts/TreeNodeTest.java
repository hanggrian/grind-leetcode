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
        assertThat(node.val).isEqualTo(1);

        TreeNode left = node.left;
        assertThat(left.val).isEqualTo(2);

        left = left.left;
        assertThat(left.val).isEqualTo(4);

        TreeNode right = node.right;
        assertThat(right.val).isEqualTo(3);

        right = right.right;
        assertThat(right.val).isEqualTo(7);
    }
}
