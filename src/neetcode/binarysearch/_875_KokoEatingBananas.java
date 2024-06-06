package neetcode.binarysearch;

import java.util.Arrays;

public class _875_KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int left = Arrays.stream(piles).min().getAsInt();
        int right = Arrays.stream(piles).max().getAsInt();
        while(left <= right){
            int mid = left + (right - left)/2;
            if(isSuccessful(piles, h, mid)){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }

    public static boolean isSuccessful(int[] piles, int h, int k){
        return numRequiredHours(piles, k) <= h;
    }

    public static int numRequiredHours(int[] piles, int k){
        int numHours = 0;
        for(int pile : piles){
            numHours += (int) Math.ceil((double)pile / k);;
            //System.out.printf("Current Pile: %d\tCurrent k: %d\tNum Hours: %d\n", pile, k, currentDuration);
        }
        return numHours;
    }
}
