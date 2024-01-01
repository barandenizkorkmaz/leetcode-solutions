package trees.binary;

import util.TreeNode;

// https://leetcode.com/problems/maximum-depth-of-binary-tree/

public class _104_MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        else{
            int left = maxDepth(root.left) + 1;
            int right = maxDepth(root.right) + 1;
            return Math.max(left,right);
        }
    }
}
