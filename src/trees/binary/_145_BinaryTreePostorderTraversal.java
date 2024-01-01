package trees.binary;

// https://leetcode.com/problems/binary-tree-postorder-traversal/

import util.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class _145_BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<Integer>();
        if(root!=null){
            res.addAll(postorderTraversal(root.left));
            res.addAll(postorderTraversal(root.right));
            res.add(root.val);
        }
        return res;
    }
}
