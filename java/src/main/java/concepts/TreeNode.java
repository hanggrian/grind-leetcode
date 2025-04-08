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
        return node1.val == node2.val
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
        return Objects.hashCode(val);
    }

    public static TreeNode of(Integer... vals) {
        if (vals == null || vals.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(vals[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty() && i < vals.length) {
            TreeNode node = queue.poll();
            Integer val = vals[i];
            if (val != null) {
                node.left = new TreeNode(val);
                queue.add(node.left);
            }
            i++;
            if (i < vals.length) {
                val = vals[i];
                if (val != null) {
                    node.right = new TreeNode(val);
                    queue.add(node.right);
                }
            }
            i++;
        }
        return root;
    }
}
