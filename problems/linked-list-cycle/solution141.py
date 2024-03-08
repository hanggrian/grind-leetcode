from concepts.lists.list_node import SinglyListNode


class RememberVisits:
    @staticmethod
    def has_cycle(head: SinglyListNode) -> bool:
        # visited nodes
        visits = set()

        node = head
        while node:
            if node in visits:
                return True
            visits.add(node)
            node = node.next
        return False


class FastSlowPointers:
    @staticmethod
    def has_cycle(head: SinglyListNode) -> bool:
        if not head or not head.next:
            return False
        slow, fast = head, head.next
        while fast and fast.next and slow != fast:
            slow = slow.next
            fast = fast.next.next
        return slow == fast
