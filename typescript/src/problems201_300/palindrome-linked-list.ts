import SinglyListNode from "../concepts/singly-list-node";

class Problem {
  isPalindrome(head: SinglyListNode | undefined): boolean {
    throw new Error(`Not implemented (${head}).`);
  }
}

class Default extends Problem {
  isPalindrome(head: SinglyListNode | undefined): boolean {
    let slow: SinglyListNode | undefined = head;
    let fast: SinglyListNode | undefined = head;
    while (fast && fast.next) {
      slow = slow.next;
      fast = fast.next.next;
    }

    let right: SinglyListNode | undefined = this.reverse(slow);
    slow.next = undefined; // sever
    let left: SinglyListNode | undefined = head;

    while (left && right) {
      if (left.val !== right.val) {
        return false;
      }
      left = left.next;
      right = right.next;
    }
    return true;
  }

  reverse(node) {
    let previous: SinglyListNode | undefined = undefined;
    let current: SinglyListNode | undefined = node;
    while (current) {
      const next: SinglyListNode | undefined = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    return previous;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
