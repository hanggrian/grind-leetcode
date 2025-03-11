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
                        .min(Comparator.comparingInt(n -> n.value))
                        .get()

                // append lowest to current
                current.next = new SinglyListNode(lowest.value)
                current = current.next

                // remove the lowest node within list
                if (lowest.next == null) {
                    nodes.remove(lowest)
                    continue
                }
                var next = lowest.next
                lowest.value = next.value
                lowest.next = next.next
            }
            return root.next
        }
    }

    abstract SinglyListNode mergeKLists(SinglyListNode[] lists)
}
