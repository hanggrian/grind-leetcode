package problems101_200

import concepts.TreeNode

enum BinaryTreeRightSideView {
    DEFAULT{
        @Override
        List<Integer> rightSideView(TreeNode root) {
            ArrayList<Integer> result = []
            dfs(root, result, 0)
            return result
        }

        void dfs(TreeNode node, List<Integer> list, int level) {
            if (!node) {
                return
            }
            if (level == list.size()) {
                list.add(node.val)
            }
            dfs(node.right, list, level + 1)
            dfs(node.left, list, level + 1)
        }
    }

    abstract List<Integer> rightSideView(TreeNode root)
}
