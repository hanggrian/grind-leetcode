class Problem {
  isPalindrome(head) {
    throw new Error(`Not implemented (${head}).`);
  }
}

class Default extends Problem {
  isPalindrome(head) {
    let slow = head;
    let fast = head;
    while (fast && fast.next) {
      slow = slow.next;
      fast = fast.next.next;
    }

    let right = this.reverse(slow);
    slow.next = undefined; // sever
    let left = head;

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
    let previous = undefined;
    let current = node;
    while (current) {
      const next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    return previous;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
