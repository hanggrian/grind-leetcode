package problems101_200;

import java.util.Stack;

class MinStack {
    Stack<Integer> main = new Stack<>();
    Stack<Integer> mins = new Stack<>();

    void push(int val) {
        main.push(val);
        if (val <= getMinimum()) {
            mins.push(val);
        }
    }

    int getMinimum() {
        if (mins.isEmpty()) {
            return Integer.MAX_VALUE;
        }
        return mins.peek();
    }

    void pop() {
        int val = main.pop();
        if (val == getMinimum()) {
            mins.pop();
        }
    }

    int top() {
        return main.peek();
    }
}
