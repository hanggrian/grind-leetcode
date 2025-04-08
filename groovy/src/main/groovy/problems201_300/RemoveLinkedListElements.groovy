package problems201_300

import concepts.SinglyListNode

enum RemoveLinkedListElements {
    DEFAULT{
        @Override
        SinglyListNode removeElements(SinglyListNode head, int val) {
            var newHead = new SinglyListNode()
            var currentNew = newHead

            var current = head
            while (current) {
                if (current.val != val) {
                    currentNew.next = new SinglyListNode(current.val)
                    currentNew = currentNew.next
                }
                current = current.next
            }
            return newHead.next
        }
    }

    abstract SinglyListNode removeElements(SinglyListNode head, int val)
}
