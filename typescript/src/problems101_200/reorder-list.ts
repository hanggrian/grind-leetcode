import SinglyListNode from '../concepts/singly-list-node';

class Problem {
  reorderList(head: SinglyListNode | undefined) {
    throw new Error(`Not implemented (${head}).`);
  }
}

class Default extends Problem {
  reorderList(head: SinglyListNode | undefined) {
    const mid: SinglyListNode = this.getMid(head);
    let right: SinglyListNode = this.reverse(mid);
    mid.next = undefined;
    let left: SinglyListNode = head;

    let current: SinglyListNode = new SinglyListNode();
    let flag: boolean = true;
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

  reverse(node: SinglyListNode | undefined): SinglyListNode | undefined {
    let previous: SinglyListNode | undefined = undefined;
    let current: SinglyListNode | undefined = node;
    while (current) {
      let temp = current.next;
      current.next = previous;
      previous = current;
      current = temp;
    }
    return previous;
  }

  getMid(node: SinglyListNode | undefined): SinglyListNode | undefined {
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
