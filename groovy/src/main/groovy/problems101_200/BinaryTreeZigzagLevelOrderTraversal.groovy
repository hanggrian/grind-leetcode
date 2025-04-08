package problems101_200

import concepts.TreeNode

enum BinaryTreeZigzagLevelOrderTraversal {
    DEFAULT{
        @Override
        List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            ArrayList<List<Integer>> lists = []
            if (!root) {
                return lists
            }

            LinkedList<TreeNode> queue = []
            queue.add(root)
            while (!queue.isEmpty()) {
                var size = queue.size()
                ArrayList<Integer> level = []
                for (var i = 0; i < size; i++) {
                    var node = queue.remove()
                    level.add(node.val)
                    if (node.left) {
                        queue.add(node.left)
                    }
                    if (node.right) {
                        queue.add(node.right)
                    }
                }
                lists.add(level)
            }

            for (var i = 0; i < lists.size(); i++) {
                if (i % 2 == 1) {
                    Collections.reverse(lists.get(i))
                }
            }
            return lists
        }
    }

    abstract List<List<Integer>> zigzagLevelOrder(TreeNode root)
}
