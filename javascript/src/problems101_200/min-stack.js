import Stack from '../util/stack';

export default class MinStack {
  main = new Stack();
  mins = new Stack();

  push(value) {
    this.main.push(value);
    if (value <= this.getMinimum()) {
      this.mins.push(value);
    }
  }

  getMinimum() {
    return this.mins.isEmpty()
        ? Number.MAX_SAFE_INTEGER
        : this.mins.peek();
  }

  pop() {
    const value = this.main.pop();
    if (value === this.getMinimum()) {
      this.mins.pop();
    }
  }

  top() {
    return this.main.peek();
  }
}
