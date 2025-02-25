package problems1_100;

import concepts.SinglyListNode;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

enum MergeKSortedLists {
    DEFAULT {
        @Override
        SinglyListNode mergeKLists(SinglyListNode[] lists) {
            List<SinglyListNode> nodes =
                Arrays
                    .stream(lists)
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());
            if (nodes.isEmpty()) {
                return null;
            }

            SinglyListNode root = new SinglyListNode();
            SinglyListNode current = root;
            while (!nodes.isEmpty()) {
                // find lowest
                SinglyListNode lowest =
                    nodes
                        .stream()
                        .min(Comparator.comparingInt(n -> n.value))
                        .get();

                // append lowest to current
                current.next = new SinglyListNode(lowest.value);
                current = current.next;

                // remove the lowest node within list
                if (lowest.next == null) {
                    nodes.remove(lowest);
                    continue;
                }
                SinglyListNode next = lowest.next;
                lowest.value = next.value;
                lowest.next = next.next;
            }
            return root.next;
        }
    };

    abstract SinglyListNode mergeKLists(SinglyListNode[] lists);
}
