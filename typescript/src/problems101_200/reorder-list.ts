import {SinglyListNode} from '../concepts/list-nodes';

class Problem {
  reorderList(head: SinglyListNode) {
    throw new Error(`Not implemented (${head}).`);
  }
}

class Default extends Problem {
  reorderList(head: SinglyListNode) {
    const mid = this.getMid(head);
    let right = this.reverse(mid);
    mid.next = null;
    let left = head;

    let current = new SinglyListNode();
    let flag = true;
    while (left != null && right != null) {
      if (flag) {
        current.next = left;
        left = left.next;
      } else {
        current.next = right;
        right = right.next;
      }
      current = current.next;
      flag = !flag;
    }
  }

  reverse(node: SinglyListNode): SinglyListNode {
    let previous = null;
    let current = node;
    while (current) {
      let temp = current.next;
      current.next = previous;
      previous = current;
      current = temp;
    }
    return previous;
  }

  getMid(node: SinglyListNode): SinglyListNode {
    let slow = node;
    let fast = node;
    while (fast && fast.next) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
