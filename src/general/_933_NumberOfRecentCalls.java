package general;

import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    int counter;
    Queue<Integer> requests;

    public RecentCounter() {
        counter = 0;
        requests = new LinkedList<>();
    }

    public int ping(int t) {
        this.requests.add(t);
        while(t - requests.peek() > 3000){
            requests.poll();
        }
        return requests.size();
    }
}
