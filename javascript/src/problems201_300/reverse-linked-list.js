class Problem {
  reverseList(head) {
    throw new Error(`Not implemented (${head}).`);
  }
}

class Default extends Problem {
  reverseList(head) {
    let previous = undefined;
    let current = head;
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
