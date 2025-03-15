import SinglyListNode from '../concepts/singly-list-node';

class Problem {
  reorderList(head) {
    throw new Error(`Not implemented (${head}).`);
  }
}

class Default extends Problem {
  reorderList(head) {
    const mid = this.getMid(head);
    let right = this.reverse(mid);
    mid.next = undefined;
    let left = head;

    let current = new SinglyListNode();
    let flag = true;
    while (left && right) {
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

  reverse(node) {
    let previous = undefined;
    let current = node;
    while (current) {
      let temp = current.next;
      current.next = previous;
      previous = current;
      current = temp;
    }
    return previous;
  }

  getMid(node) {
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
