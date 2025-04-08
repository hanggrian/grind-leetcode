package problems201_300

import concepts.TreeNode

enum BinaryTreePaths {
    DEFAULT{
        @Override
        List<String> binaryTreePaths(TreeNode root) {
            ArrayList<String> paths = []
            dfs(root, paths, "")
            return paths
        }

        void dfs(TreeNode node, List<String> paths, String path) {
            if (!node) {
                return
            }
            if (!node.left && !node.right) {
                paths.add("${path}${node.val}".toString())
            }
            if (node.left) {
                dfs(node.left, paths, "${path}${node.val}->".toString())
            }
            if (node.right) {
                dfs(node.right, paths, "${path}${node.val}->".toString())
            }
        }
    }

    abstract List<String> binaryTreePaths(TreeNode root)
}
