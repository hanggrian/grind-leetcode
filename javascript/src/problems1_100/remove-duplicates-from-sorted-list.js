class Problem {
  deleteDuplicates(head) {
    throw new Error(`Not implemented (${head}).`);
  }
}

class Default extends Problem {
  deleteDuplicates(head) {
    let current = head;
    while (current && current.next) {
      if (current.value === current.next.value) {
        current.next = current.next.next;
      } else {
        current = current.next;
      }
    }
    return head;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
