package trees.binary;

import util.TreeNode;

// https://leetcode.com/problems/validate-binary-search-tree/

public class _98_ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return recurseIsValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean recurseIsValidBST(TreeNode root, long minValue, long maxValue){
        if(root == null)return true;
        if(root.val >= maxValue || root.val <= minValue)return false;
        return recurseIsValidBST(root.left, minValue, root.val) && recurseIsValidBST(root.right, root.val, maxValue);
    }
}
