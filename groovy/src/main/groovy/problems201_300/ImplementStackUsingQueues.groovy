package problems201_300

class ImplementStackUsingQueues {
    private final LinkedList<Integer> queue1 = []
    private final LinkedList<Integer> queue2 = []

    void push(int x) {
        if (empty()) {
            queue1.add(x)
        } else if (queue1.isEmpty()) {
            queue2.add(x)
        } else {
            queue1.add(x)
        }
    }

    int pop() {
        var primary = getPrimary()
        var secondary = getSecondary()
        while (primary.size() > 1) {
            secondary.add(primary.remove())
        }
        return primary.remove()
    }

    int top() {
        Queue<Integer> primary = getPrimary()
        Queue<Integer> secondary = getSecondary()
        while (primary.size() > 1) {
            secondary.add(primary.remove())
        }
        int value = primary.remove()
        secondary.add(value)
        return value
    }

    boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty()
    }

    private Queue<Integer> getPrimary() {
        return queue1.isEmpty() ? queue2 : queue1
    }

    private Queue<Integer> getSecondary() {
        return queue1.isEmpty() ? queue1 : queue2
    }
}
