import SinglyListNode from '../concepts/singly-list-node';

class Problem {
  mergeTwoLists(l1, l2) {
    throw new Error(`Not implemented (${l1}, ${l2}).`);
  }
}

class Default extends Problem {
  mergeTwoLists(l1, l2) {
    if (!l1) {
      return l2;
    }
    if (!l2) {
      return l1;
    }
    const root = new SinglyListNode();
    let current = root;

    // when both items are there
    while (l1 && l2) {
      if (l1.val < l2.val) {
        current.next = new SinglyListNode(l1.val);
        l1 = l1.next;
      } else {
        current.next = new SinglyListNode(l2.val);
        l2 = l2.next;
      }
      current = current.next;
    }

    // remaining
    current.next = l1 || l2;
    return root.next;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
