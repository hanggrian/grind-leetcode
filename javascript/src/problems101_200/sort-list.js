import SinglyListNode from '../concepts/singly-list-node';

class Problem {
  sortList(head) {
    throw new Error(`Not implemented (${head}).`);
  }
}

class Default extends Problem {
  sortList(head) {
    if (!head || !head.next) {
      return head;
    }
    const mid = this.split(head);
    return this.merge(
        this.sortList(head),
        this.sortList(mid),
    );
  }


  merge(node1, node2) {
    const root = new SinglyListNode();
    let current = root;
    while (node1 && node2) {
      if (node1.value < node2.value) {
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

  split(node) {
    let slowPrev = undefined;
    let slow = node;
    let fast = node;
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
