package array;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

public class _80_RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        int size = nums.length;
        int lastUnique = Integer.MIN_VALUE;
        int lastUniqueIndex = -1;
        int count = 0;

        for(int i = 0; i < size; i++){
            if(nums[i] != lastUnique){
                // Add current
                nums[lastUniqueIndex+1] = nums[i];
                lastUnique = nums[i];
                lastUniqueIndex++;
                count++;
                // Process nearest neighbor
                if(i + 1 < size && nums[i+1] == nums[i]){
                    nums[lastUniqueIndex+1] = nums[i+1];
                    lastUniqueIndex++;
                    count++;
                    i++;
                }
            }
        }
        return count;
    }
}
