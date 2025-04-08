import SinglyListNode from '../concepts/singly-list-node';

class Problem {
  sortList(head: SinglyListNode | undefined): SinglyListNode | undefined {
    throw new Error(`Not implemented (${head}).`);
  }
}

class Default extends Problem {
  sortList(head: SinglyListNode | undefined): SinglyListNode | undefined {
    if (!head || !head.next) {
      return head;
    }
    const mid: SinglyListNode | undefined = this.split(head);
    return this.merge(
        this.sortList(head),
        this.sortList(mid),
    );
  }


  merge(
      node1: SinglyListNode | undefined,
      node2: SinglyListNode | undefined,
  ): SinglyListNode | undefined {
    const root: SinglyListNode = new SinglyListNode();
    let current: SinglyListNode = root;
    while (node1 && node2) {
      if (node1.val < node2.val) {
        current.next = node1;
        node1 = node1.next;
      } else {
        current.next = node2;
        node2 = node2.next;
      }
      current = current.next;
    }
    if (node1) {
      current.next = node1;
    } else if (node2) {
      current.next = node2;
    }
    return root.next;
  }

  split(node: SinglyListNode | undefined): SinglyListNode | undefined {
    let slowPrev: SinglyListNode | undefined = undefined;
    let slow: SinglyListNode = node;
    let fast: SinglyListNode | undefined = node;
    while (fast && fast.next) {
      slowPrev = slow;
      slow = slow.next;
      fast = fast.next.next;
    }
    slowPrev.next = undefined;
    return slow;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
