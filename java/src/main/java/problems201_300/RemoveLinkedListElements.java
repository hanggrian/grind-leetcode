package problems201_300;

import concepts.SinglyListNode;

enum RemoveLinkedListElements {
    DEFAULT {
        @Override
        SinglyListNode removeElements(SinglyListNode head, int val) {
            SinglyListNode newHead = new SinglyListNode();
            SinglyListNode currentNew = newHead;

            SinglyListNode current = head;
            while (current != null) {
                if (current.val != val) {
                    currentNew.next = new SinglyListNode(current.val);
                    currentNew = currentNew.next;
                }
                current = current.next;
            }
            return newHead.next;
        }
    };

    abstract SinglyListNode removeElements(SinglyListNode head, int val);
}
