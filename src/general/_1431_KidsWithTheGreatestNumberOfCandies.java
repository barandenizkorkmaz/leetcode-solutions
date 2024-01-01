package general;

import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

public class _1431_KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int index = 0;
        int max = candies[0];
        List<Boolean> result = new LinkedList<>();

        for(int i = 1; i < candies.length; i++){
            if(candies[i] > max){
                index = i;
                max = candies[i];
            }
        }

        for(int i = 0; i < candies.length; i++){
            result.add(candies[i] + extraCandies >= max);
        }

        return result;
    }
}
