package concepts

class TreeNode extends Node {
    TreeNode left
    TreeNode right

    TreeNode() {
        super(0)
    }

    TreeNode(int value) {
        super(value)
    }

    TreeNode(int value, TreeNode left, TreeNode right) {
        super(value)
        this.left = left
        this.right = right
    }

    final boolean hasLeft() {
        return left != null
    }

    final boolean hasRight() {
        return right != null
    }

    final boolean isLeaf() {
        return left == null && right == null
    }

    private boolean recursiveEquals(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true
        }
        if (node1 == null || node2 == null) {
            return false
        }
        return node1.value == node2.value
            && recursiveEquals(node1.left, node2.left)
            && recursiveEquals(node1.right, node2.right)
    }

    @Override
    boolean equals(Object other) {
        if (!(other instanceof TreeNode)) {
            return false
        }
        return recursiveEquals(this, (TreeNode) other)
    }

    @Override
    int hashCode() {
        return Objects.hashCode(value)
    }

    static TreeNode of(Integer... values) {
        if (values == null || values.length == 0) {
            return null
        }
        TreeNode root = new TreeNode(values[0])
        LinkedList<TreeNode> queue = []
        queue.add(root)
        int i = 1
        while (!queue.isEmpty() && i < values.length) {
            TreeNode node = queue.poll()
            if (i < values.length && values[i] != null) {
                node.left = new TreeNode(values[i])
                queue.add(node.left)
            }
            i++
            if (i < values.length && values[i] != null) {
                node.right = new TreeNode(values[i])
                queue.add(node.right)
            }
            i++
        }
        return root
    }
}
