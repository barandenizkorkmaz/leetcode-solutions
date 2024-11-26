package array;

import java.util.LinkedList;
import java.util.List;

public class _1431_KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new LinkedList<>();
        int max = 0;
        for(int candy : candies){
            if(candy > max)max = candy;
        }
        for(int candy : candies){
            if(candy + extraCandies >= max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}
