package array;

// https://leetcode.com/problems/merge-sorted-array/

public class _88_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index_m = m - 1;
        int index_n = n - 1;
        int index = m + n - 1;
        while(index >= 0 && index_m >= 0 && index_n >= 0){
            if(nums1[index_m] > nums2[index_n]){
                nums1[index] = nums1[index_m];
                index_m --;
            }
            else{
                nums1[index] = nums2[index_n];
                index_n --;
            }
            index --;
        }

        if(index_m < 0){
            while(index_n >= 0){
                nums1[index] = nums2[index_n];
                index_n--;
                index--;
            }
        }
        else{
            while(index_m >= 0){
                nums1[index] = nums1[index_m];
                index_m--;
                index--;
            }
        }
    }
}
