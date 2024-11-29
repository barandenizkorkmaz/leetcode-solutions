package search.binary;

public class _875_KokoEatingBananas {
    private boolean isPossible(int[] piles, int k, int h){
        int res = 0;
        for(int pile : piles){
            res += Math.ceil((double) pile/k);
        }
        return res <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int pile : piles){
            if(pile > high)high = pile;
        }
        int result = high;
        while(low < high){
            int mid = low + (high - low)/2;
            if(isPossible(piles, mid, h)){ // can eat
                result = Math.min(result, mid);
                high = mid;
            }
            else{ // cannot eat, increase low
                low = mid + 1;
            }
        }
        return result;
    }
}
