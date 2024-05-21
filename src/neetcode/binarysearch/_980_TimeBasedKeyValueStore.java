package neetcode.binarysearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class _980_TimeBasedKeyValueStore {

    class Node{
        String value;
        int timestamp;

        Node(String value, int timestamp){
            this.value = value;
            this.timestamp = timestamp;
        }
    }

    Map<String, List<Node>> map;

    public _980_TimeBasedKeyValueStore() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        Node newNode = new Node(value, timestamp);
        if(map.containsKey(key)){
            map.get(key).add(newNode);
        }
        else{
            List<Node>l = new ArrayList<>();
            l.add(newNode);
            map.put(key,l);
        }
    }

    public String get(String key, int timestamp) {
        if(!map.containsKey(key))return "";
        List<Node> list = map.get(key);
        return binarySearch(list, timestamp);
    }

    String binarySearch(List<Node> list, int target){
        int left = 0;
        int right = list.size() - 1;
        while(left < right){
            int mid = left + (right-left)/2 + 1;
            if(list.get(mid).timestamp < target)left = mid;
            else if(list.get(mid).timestamp>target)right = mid-1;
            else return list.get(mid).value;
        }
        return (list.get(left).timestamp > target) ? "" : list.get(left).value;
    }

}