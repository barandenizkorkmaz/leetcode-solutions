package implementations;

import java.util.LinkedList;

// https://leetcode.com/problems/design-hashmap/

public class _706_HashMap {
    class MyHashMap {

        private static final int SIZE = 1000;
        private LinkedList<Entry>[] buckets;

        private class Entry {
            public int key;
            public int value;

            public Entry(int key, int value){
                this.key = key;
                this.value = value;
            }
        }

        public MyHashMap() {
            buckets = new LinkedList[SIZE];
            for(int i = 0; i < SIZE; i++){
                buckets[i] = new LinkedList<Entry>();
            }
        }

        public void put(int key, int value) {
            int index = hash(key);
            LinkedList<Entry> bucket = buckets[index];
            for(Entry e : bucket){
                if(e.key == key){
                    e.value = value;
                    return;
                }
            }
            bucket.add(new Entry(key, value));
        }

        public int get(int key) {
            int index = hash(key);
            LinkedList<Entry> bucket = buckets[index];
            for(Entry e : bucket){
                if(e.key == key){
                    return e.value;
                }
            }
            return -1;
        }

        public void remove(int key) {
            int index = hash(key);
            LinkedList<Entry> bucket = buckets[index];
            for(Entry e : bucket){
                if(e.key == key){
                    bucket.remove(e);
                    return;
                }
            }
        }

        private int hash(int key){
            return key % SIZE;
        }
    }

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
}
