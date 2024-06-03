package neetcode.stack;

class MinStack {

    private Node head;

    public MinStack() {
        this.head = null;
    }

    public void push(int val) {
        if(head == null){
            head = new Node(val, null, val);
        }
        else{
            head = new Node(val, head, Math.min(val, head.min));
        }
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.value;
    }

    public int getMin() {
        return head.min;
    }

    private static class Node{
        int value;
        Node next;
        int min;

        private Node(int value, Node next, int min){
            this.value = value;
            this.next = next;
            this.min = min;
        }

    }
}

