package trees.binary;

import util.TreeNode;

public class _1448_CountGoodNodesInBinaryTree {
    public int goodNodes(TreeNode root) {
        if(root == null)return 0;
        return 1 + numGoodNodes(root.left, root.val) + numGoodNodes(root.right, root.val);
    }

    private int numGoodNodes(TreeNode current, int currentMaximum){
        if(current == null)return 0;
        if(current.val >= currentMaximum)return 1 + numGoodNodes(current.left, current.val) + numGoodNodes(current.right, current.val);
        else return numGoodNodes(current.left, currentMaximum) + numGoodNodes(current.right, currentMaximum);
    }
}
