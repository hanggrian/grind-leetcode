package problems101_200;

import concepts.TreeNode;
import java.util.ArrayList;
import java.util.List;

enum BinaryTreeRightSideView {
    DEFAULT {
        @Override
        List<Integer> rightSideView(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            dfs(root, result, 0);
            return result;
        }

        void dfs(TreeNode node, List<Integer> list, int level) {
            if (node == null) {
                return;
            }
            if (level == list.size()) {
                list.add(node.val);
            }
            dfs(node.right, list, level + 1);
            dfs(node.left, list, level + 1);
        }
    };

    abstract List<Integer> rightSideView(TreeNode root);
}
