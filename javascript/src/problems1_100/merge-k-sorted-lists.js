import {SinglyListNode} from '../concepts/list-nodes';

class Problem {
  mergeKLists(lists) {
    throw new Error(`'Not implemented (${lists}).`);
  }
}

class Default extends Problem {
  mergeKLists(lists) {
    let nodes = lists.filter(n => n !== undefined);
    if (nodes.length === 0) {
      return undefined;
    }

    let root = new SinglyListNode();
    let current = root;
    while (nodes.length > 0) {
      // find lowest
      let lowest =
        nodes.reduce((previous, current) => current.value < previous.value ? current : previous);

      // append lowest to current
      current.next = new SinglyListNode(lowest.value);
      current = current.next;

      // remove the lowest node within list
      if (!lowest.next) {
        nodes.splice(nodes.indexOf(lowest), 1);
        continue;
      }
      let nxt = lowest.next;
      lowest.value = nxt.value;
      lowest.next = nxt.next;
    }
    return root.next;
  }
}

export const SOLUTIONS = [new Default()];
