package trees.binary;

import util.TreeNode;

// https://leetcode.com/problems/path-sum/

public class _112_PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSumRecurse(root, targetSum, 0);
    }

    private boolean hasPathSumRecurse(TreeNode root, int targetSum, int currentSum){
        if(root == null){
            return false;
        }

        if(root.left == null && root.right == null){
            if(targetSum == currentSum + root.val){
                return true;
            }
        }

        boolean left = hasPathSumRecurse(root.left, targetSum, currentSum + root.val);
        boolean right = hasPathSumRecurse(root.right, targetSum, currentSum + root.val);

        return left || right;

    }
}
