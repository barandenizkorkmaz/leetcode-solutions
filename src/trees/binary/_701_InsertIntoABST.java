package trees.binary;

import util.TreeNode;

public class _701_InsertIntoABST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null)return new TreeNode(val);
        if(val < root.val){
            root.left = insertIntoBST(root.left, val);
            return root;
        }
        else{
            root.right = insertIntoBST(root.right, val);
            return root;
        }
    }
}
