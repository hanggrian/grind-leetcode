package problems1_100

import concepts.SinglyListNode

enum RemoveDuplicatesFromSortedList2 {
    DEFAULT{
        @Override
        SinglyListNode deleteDuplicates(SinglyListNode head) {
            var root = new SinglyListNode(-101, head)
            var previous = root
            var current = head
            while (current) {
                if (current.next && current.next.val == current.val) {
                    while (current.next && current.next.val == current.val) {
                        current = current.next
                    }
                    previous.next = current.next
                } else {
                    previous = previous.next
                }
                current = current.next
            }
            return root.next
        }
    }

    abstract SinglyListNode deleteDuplicates(SinglyListNode head)
}
