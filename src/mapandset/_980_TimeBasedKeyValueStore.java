package mapandset;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class _980_TimeBasedKeyValueStore {

    Map<String, TreeMap<Integer, String>> map;

    public _980_TimeBasedKeyValueStore() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        TreeMap<Integer, String> treeMap = map.getOrDefault(key, new TreeMap<>());
        treeMap.put(timestamp, value);
        map.put(key, treeMap);
    }

    public String get(String key, int timestamp) {
        if(!map.containsKey(key))return "";
        TreeMap<Integer, String> treeMap = map.get(key);
        Map.Entry<Integer, String> entry = treeMap.floorEntry(timestamp);
        return (entry == null) ? "" : entry.getValue();
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */