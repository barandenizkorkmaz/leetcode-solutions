package priorityqueue;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class _347_TopKFrequentElements {
    class EntityComparator implements Comparator<Entity> {
        public int compare(Entity entity1, Entity entity2){
            return entity2.count - entity1.count;
        }
    }

    class Entity{
        int num;
        int count;

        public Entity(int num, int count){
            this.num = num;
            this.count = count;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numOccurences = new HashMap<>();
        PriorityQueue<Entity> pq = new PriorityQueue<>(new EntityComparator());
        for(int num : nums){
            numOccurences.put(num, numOccurences.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : numOccurences.entrySet()){
            pq.add(new Entity(entry.getKey(), entry.getValue()));
        }
        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = pq.poll().num;
        }
        return result;
    }
}
