package problems201_300

import concepts.TreeNode

enum CountCompleteTreeNodes {
    DEFAULT{
        @Override
        int countNodes(TreeNode root) {
            if (!root) {
                return 0
            }
            var count = 0
            LinkedList<TreeNode> queue = []
            queue.add(root)
            while (!queue.isEmpty()) {
                var node = queue.remove()
                count++
                if (node.left) {
                    queue.add(node.left)
                }
                if (node.right) {
                    queue.add(node.right)
                }
            }
            return count
        }
    }

    abstract int countNodes(TreeNode root)
}
