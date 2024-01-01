package general;

// https://leetcode.com/problems/can-place-flowers/

public class _605_CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int previous = -1;
        int remaining = n;
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] != 1 && previous != 1){
                if((i + 1 < flowerbed.length && flowerbed[i + 1] != 1) || (i == flowerbed.length - 1)){
                    flowerbed[i] = 1;
                    remaining--;
                }
            }
            if(remaining <= 0){
                return true;
            }
            previous = flowerbed[i];
        }
        return false;
    }
}
