package trees.binary;

import util.TreeNode;

// https://leetcode.com/problems/search-in-a-binary-search-tree/

public class _700_SearchInABST {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root== null)
            return null;
        if (root.val== val)
            return root;
        return val< root.val ? searchBST(root.left, val) : searchBST(root.right, val);
    }
}
