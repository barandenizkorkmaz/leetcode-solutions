package trees.binary;

import util.TreeNode;

public class _110_BalancedBinaryTree {
    private int height(TreeNode current){
        if(current == null)return 0;
        int left = height(current.left) + 1;
        int right = height(current.right) + 1;
        return Math.max(left, right);
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null)return true;
        int left = height(root.left);
        int right = height(root.right);
        if(Math.abs(left - right) > 1)return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}
