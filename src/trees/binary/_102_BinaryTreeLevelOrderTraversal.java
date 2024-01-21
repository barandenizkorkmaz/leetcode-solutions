package trees.binary;

//https://leetcode.com/problems/binary-tree-level-order-traversal/description/

import util.TreeNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 TODO: The code below requires further optimization! addAll operations are expensive and using two queues causes redundant
 space complexity
 */

public class _102_BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)return Collections.emptyList();
        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> currentLevel = new LinkedList<>();
        Queue<TreeNode> nextLevel = new LinkedList<>();
        nextLevel.add(root);
        do{
            currentLevel.addAll(nextLevel);
            nextLevel.clear();
            List<Integer> current = new LinkedList<>();
            while(!currentLevel.isEmpty()){
                TreeNode node = currentLevel.remove();
                if(node != null){
                    current.add(node.val);
                    nextLevel.add(node.left);
                    nextLevel.add(node.right);
                }
            }
            if(!current.isEmpty())res.add(current);
        } while(!nextLevel.isEmpty());
        return res;
    }
}
