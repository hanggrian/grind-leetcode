package problems201_300;

import concepts.TreeNode;
import java.util.ArrayList;
import java.util.List;

enum BinaryTreePaths {
    DEFAULT {
        @Override
        List<String> binaryTreePaths(TreeNode root) {
            List<String> paths = new ArrayList<>();
            dfs(root, paths, "");
            return paths;
        }

        void dfs(TreeNode node, List<String> paths, String path) {
            if (node == null) {
                return;
            }
            if (node.left == null && node.right == null) {
                paths.add(String.format("%s%d", path, node.val));
            }
            if (node.left != null) {
                dfs(node.left, paths, String.format("%s%d%s", path, node.val, "->"));
            }
            if (node.right != null) {
                dfs(node.right, paths, String.format("%s%d%s", path, node.val, "->"));
            }
        }
    };

    abstract List<String> binaryTreePaths(TreeNode root);
}
