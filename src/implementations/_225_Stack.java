package implementations;

// https://leetcode.com/problems/implement-stack-using-queues/description/

import java.util.LinkedList;
import java.util.Queue;

class Stack {

    Queue<Integer> queue;

    public Stack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
        for(int i = 0; i < queue.size() -1 ; i++){
            queue.add(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}


