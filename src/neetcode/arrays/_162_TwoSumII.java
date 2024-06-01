package neetcode.arrays;

public class _162_TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int[] indices = new int[2];
        int left = 0;
        int right = numbers.length-1;
        while(left < right){
            int currentSum = numbers[left] + numbers[right];
            int mid = left + (right - left)/2;
            if(currentSum == target){
                indices[0] = left + 1;
                indices[1] = right + 1;
                break;
            }
            if(currentSum < target){
                left = (numbers[mid] + numbers[right] < target) ? mid + 1 : left+1;
            } else {
                right =  (numbers[mid] + numbers[left] > target) ? mid - 1 : right - 1;
            }
        }
        return indices;
    }
}
