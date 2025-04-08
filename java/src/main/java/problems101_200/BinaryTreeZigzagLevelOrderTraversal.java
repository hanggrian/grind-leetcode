package problems101_200;

import concepts.TreeNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

enum BinaryTreeZigzagLevelOrderTraversal {
    DEFAULT {
        @Override
        List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> lists = new ArrayList<>();
            if (root == null) {
                return lists;
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> level = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.remove();
                    level.add(node.val);
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
                lists.add(level);
            }

            for (int i = 0; i < lists.size(); i++) {
                if (i % 2 == 1) {
                    Collections.reverse(lists.get(i));
                }
            }
            return lists;
        }
    };

    abstract List<List<Integer>> zigzagLevelOrder(TreeNode root);
}
