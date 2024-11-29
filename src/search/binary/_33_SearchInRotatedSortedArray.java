package search.binary;

public class _33_SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int iter = 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target)return mid;
            if(nums[low] <= nums[mid]){ // lower part is regular
                if(nums[low] <= target && target < nums[mid]){
                    high = mid - 1;
                }
                else{ // definitely not in that regular area!
                    low = mid + 1;
                }
            }
            else{ // higher part is regular
                if(nums[mid] < target && target <= nums[high]){
                    low = mid + 1;
                }
                else{ // definitely not in that regular area!
                    high = mid - 1;
                }

            }
        }
        return -1;
    }
}
