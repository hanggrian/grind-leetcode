package problems201_300;

import concepts.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

enum CountCompleteTreeNodes {
    DEFAULT {
        @Override
        int countNodes(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int count = 0;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                TreeNode node = queue.remove();
                count++;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            return count;
        }
    };

    abstract int countNodes(TreeNode root);
}
