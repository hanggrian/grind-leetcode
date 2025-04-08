package concepts

class TreeNode extends Node {
    TreeNode left
    TreeNode right

    TreeNode() {
        super(0)
    }

    TreeNode(int val) {
        super(val)
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        super(val)
        this.left = left
        this.right = right
    }

    final boolean isLeaf() {
        return !left && !right
    }

    private boolean recursiveEquals(TreeNode node1, TreeNode node2) {
        if (!node1 && !node2) {
            return true
        }
        if (!node1 || !node2) {
            return false
        }
        return node1.val == node2.val
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
        return Objects.hashCode(val)
    }

    static TreeNode of(Integer... vals) {
        if (!vals || vals.length == 0) {
            return null
        }
        var root = new TreeNode(vals[0])
        LinkedList<TreeNode> queue = []
        queue.add(root)
        int i = 1
        while (!queue.isEmpty() && i < vals.length) {
            var node = queue.poll()
            var val = vals[i]
            if (val) {
                node.left = new TreeNode(val)
                queue.add(node.left)
            }
            i++
            if (i < vals.length) {
                val = vals[i]
                if (val) {
                    node.right = new TreeNode(val)
                    queue.add(node.right)
                }
            }
            i++
        }
        return root
    }
}
