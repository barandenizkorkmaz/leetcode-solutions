package implementations;

import java.util.HashMap;
import java.util.Map;

class LRUCache {
    class Node{
        int key;
        int val;
        Node prev;
        Node next;

        Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }

    Node head;
    Node tail;
    int capacity;
    Map<Integer, Node> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head = new Node(-1, -1);
        this.tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    private void addNode(Node newNode){
        Node tmp = head.next;

        head.next = newNode;
        newNode.prev = head;

        newNode.next = tmp;
        tmp.prev = newNode;
    }

    private void deleteNode(Node deleteNode){
        deleteNode.next.prev = deleteNode.prev;
        deleteNode.prev.next = deleteNode.next;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            int value = node.val;

            // remove node from list and add to list again and then update the reference;
            map.remove(key); // test
            deleteNode(node);
            addNode(node);

            map.put(key, head.next);
            return value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);

            // remove node - it will be added again
            // test
            map.remove(key);
            deleteNode(node);
        }
        if(map.size() == this.capacity){
            map.remove(tail.prev.key);
            deleteNode(tail.prev);
        }
        addNode(new Node(key, value));
        map.put(key, head.next);
    }
}
