package twopointers;

public class _11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int maxArea = 0;
        while(left < right){
            int current = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, current);
            if(height[left] < height[right]){left++;}
            else{right--;}
        }
        return maxArea;
    }
}
