import Stack from '../util/stack';

export default class MinStack {
  main = new Stack();
  mins = new Stack();

  push(val) {
    this.main.push(val);
    if (val <= this.getMinimum()) {
      this.mins.push(val);
    }
  }

  getMinimum() {
    if (this.mins.isEmpty()) {
      return Number.MAX_SAFE_INTEGER;
    }
    return this.mins.peek();
  }

  pop() {
    const val = this.main.pop();
    if (val === this.getMinimum()) {
      this.mins.pop();
    }
  }

  top() {
    return this.main.peek();
  }
}
