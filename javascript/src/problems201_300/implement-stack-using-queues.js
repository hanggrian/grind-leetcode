export default class ImplementStackUsingQueues {
  constructor() {
    this.queue1 = [];
    this.queue2 = [];
  }

  push(x) {
    if (this.empty()) {
      this.queue1.push(x);
    } else if (this.queue1.length === 0) {
      this.queue2.push(x);
    } else {
      this.queue1.push(x);
    }
  }

  pop() {
    const primary = this._getPrimary();
    const secondary = this._getSecondary();
    while (primary.length > 1) {
      secondary.push(primary.shift());
    }
    return primary.shift();
  }

  top() {
    const primary = this._getPrimary();
    const secondary = this._getSecondary();
    while (primary.length > 1) {
      secondary.push(primary.shift());
    }
    const value = primary.shift();
    secondary.push(value);
    return value;
  }

  empty() {
    return this.queue1.length === 0 && this.queue2.length === 0;
  }

  _getPrimary() {
    return this.queue1.length === 0 ? this.queue2 : this.queue1;
  }

  _getSecondary() {
    return this.queue1.length === 0 ? this.queue1 : this.queue2;
  }
}
