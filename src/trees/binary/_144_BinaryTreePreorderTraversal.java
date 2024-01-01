package trees.binary;

import util.TreeNode;

import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-preorder-traversal/

public class _144_BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<Integer>();
        if(root!=null){
            res.add(root.val);
            res.addAll(preorderTraversal(root.left));
            res.addAll(preorderTraversal(root.right));
        }
        return res;
    }
}
