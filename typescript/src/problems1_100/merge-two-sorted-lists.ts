import {SinglyListNode} from '../concepts/list-nodes';

class Problem {
  mergeTwoLists(l1: SinglyListNode, l2: SinglyListNode) {
    throw new Error(`'Not implemented (${l1}, ${l2}).`);
  }
}

class Default extends Problem {
  mergeTwoLists(l1: SinglyListNode, l2: SinglyListNode) {
    if (l1 === undefined) {
      return l2;
    }
    if (l2 === undefined) {
      return l1;
    }
    let root = new SinglyListNode();
    let current = root;

    // when both items are there
    while (l1 && l2) {
      if (l1.value < l2.value) {
        current.next = new SinglyListNode(l1.value);
        l1 = l1.next;
      } else {
        current.next = new SinglyListNode(l2.value);
        l2 = l2.next;
      }
      current = current.next;
    }

    // remaining
    current.next = l1 || l2;
    return root.next;
  }
}

export const SOLUTIONS = [new Default()];
