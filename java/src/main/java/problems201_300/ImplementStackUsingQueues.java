package problems201_300;

import java.util.LinkedList;
import java.util.Queue;

class ImplementStackUsingQueues {
    private final Queue<Integer> queue1 = new LinkedList<>();
    private final Queue<Integer> queue2 = new LinkedList<>();

    public void push(int x) {
        if (empty()) {
            queue1.add(x);
        } else if (queue1.isEmpty()) {
            queue2.add(x);
        } else {
            queue1.add(x);
        }
    }

    public int pop() {
        Queue<Integer> primary = getPrimary();
        Queue<Integer> secondary = getSecondary();
        while (primary.size() > 1) {
            secondary.add(primary.remove());
        }
        return primary.remove();
    }

    public int top() {
        Queue<Integer> primary = getPrimary();
        Queue<Integer> secondary = getSecondary();
        while (primary.size() > 1) {
            secondary.add(primary.remove());
        }
        int value = primary.remove();
        secondary.add(value);
        return value;
    }

    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }

    private Queue<Integer> getPrimary() {
        return queue1.isEmpty() ? queue2 : queue1;
    }

    private Queue<Integer> getSecondary() {
        return queue1.isEmpty() ? queue1 : queue2;
    }
}
