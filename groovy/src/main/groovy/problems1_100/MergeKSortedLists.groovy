package problems1_100

import concepts.SinglyListNode
import java.util.stream.Collectors

enum MergeKSortedLists {
    DEFAULT{
        @Override
        SinglyListNode mergeKLists(SinglyListNode[] lists) {
            var nodes =
                Arrays
                    .stream(lists)
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList())
            if (nodes.isEmpty()) {
                return null
            }

            var root = new SinglyListNode()
            var current = root
            while (!nodes.isEmpty()) {
                // find lowest
                var lowest =
                    nodes
                        .stream()
                        .min(Comparator.comparingInt(n -> n.val))
                        .get()

                // append lowest to current
                current.next = new SinglyListNode(lowest.val)
                current = current.next

                // remove the lowest node within list
                if (!lowest.next) {
                    nodes.remove(lowest)
                    continue
                }
                var next = lowest.next
                lowest.val = next.val
                lowest.next = next.next
            }
            return root.next
        }
    }

    abstract SinglyListNode mergeKLists(SinglyListNode[] lists)
}
