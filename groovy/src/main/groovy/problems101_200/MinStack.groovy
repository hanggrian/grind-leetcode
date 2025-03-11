package problems101_200

class MinStack {
    Stack<Integer> main = []
    Stack<Integer> mins = []

    void push(int val) {
        main.push(val)
        if (val <= getMinimum()) {
            mins.push(val)
        }
    }

    int getMinimum() {
        if (mins.isEmpty()) {
            return Integer.MAX_VALUE
        }
        return mins.peek()
    }

    void pop() {
        var val = main.pop()
        if (val == getMinimum()) {
            mins.pop()
        }
    }

    int top() {
        return main.peek()
    }
}
