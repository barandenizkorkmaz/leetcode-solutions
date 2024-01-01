package general;

// https://leetcode.com/problems/container-with-most-water/

public class _11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left < right){
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            if(height[left] < height[right])
                left++;
            else
                right--;
        }

        return maxArea;
    }
}
