package trees.binary;

import util.TreeNode;

// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

public class _108_ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    public TreeNode helper(int[] nums, int low, int high){
        if(low > high)return null;
        int mid = low + (high - low)/2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = helper(nums, low, mid - 1);
        root.right = helper(nums, mid + 1, high);
        return root;

    }
}
