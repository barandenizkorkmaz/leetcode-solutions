package neetcode.binarysearch;

public class _704_BinarySearch {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int mid = low + (high - low) / 2;
        while(low <= high){
            if(nums[mid] == target)return mid;
            else if(nums[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
            mid = low + (high - low) / 2;
        }
        return -1;
    }
}
