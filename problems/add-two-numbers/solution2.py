from concepts.lists.list_node import SinglyListNode


def add_two_numbers(l1: SinglyListNode, l2: SinglyListNode) -> bool:
    dummy = SinglyListNode()
    node = dummy
    carry = 0
    while l1 or l2:
        # calculate total and carry
        val = carry
        if l1:
            val += l1.value
            l1 = l1.next
        if l2:
            val += l2.value
            l2 = l2.next
        carry = val // 10

        # create list
        node.next = SinglyListNode(val % 10)
        node = node.next
    # create remaining carry
    if carry > 0:
        node.next = SinglyListNode(carry)
    return dummy.next
