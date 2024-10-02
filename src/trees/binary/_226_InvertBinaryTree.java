package trees.binary;

import util.TreeNode;

public class _226_InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)return null;

        TreeNode tmp = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(tmp);

        return root;
    }
}
