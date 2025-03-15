package problems101_200

import concepts.TreeNode

enum BinaryTreeLevelOrderTraversal {
    DEFAULT {
        @Override
        List<List<Integer>> levelOrder(TreeNode root) {
            ArrayList<List<Integer>> lists = []
            if (root == null) {
                return lists
            }

            LinkedList<TreeNode> queue = []
            queue.add(root)
            while (!queue.isEmpty()) {
                var size = queue.size()
                ArrayList<Integer> level = []
                for (var i = 0; i < size; i++) {
                    var current = queue.remove()
                    level.add(current.value)
                    if (current.left != null) {
                        queue.add(current.left)
                    }
                    if (current.right != null) {
                        queue.add(current.right)
                    }
                }
                lists.add(level)
            }
            return lists
        }
    }

    abstract List<List<Integer>> levelOrder(TreeNode root)
}
