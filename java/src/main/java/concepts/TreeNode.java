package concepts;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class TreeNode extends Node {
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
        super(0);
    }

    public TreeNode(int value) {
        super(value);
    }

    public TreeNode(int value, TreeNode left, TreeNode right) {
        super(value);
        this.left = left;
        this.right = right;
    }

    public final boolean hasLeft() {
        return left != null;
    }

    public final boolean hasRight() {
        return right != null;
    }

    public final boolean isLeaf() {
        return left == null && right == null;
    }

    private boolean recursiveEquals(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return node1.value == node2.value
            && recursiveEquals(node1.left, node2.left)
            && recursiveEquals(node1.right, node2.right);
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof TreeNode)) {
            return false;
        }
        return recursiveEquals(this, (TreeNode) other);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public static TreeNode of(Integer... values) {
        if (values == null || values.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            TreeNode node = queue.poll();
            if (i < values.length && values[i] != null) {
                node.left = new TreeNode(values[i]);
                queue.add(node.left);
            }
            i++;
            if (i < values.length && values[i] != null) {
                node.right = new TreeNode(values[i]);
                queue.add(node.right);
            }
            i++;
        }
        return root;
    }
}
