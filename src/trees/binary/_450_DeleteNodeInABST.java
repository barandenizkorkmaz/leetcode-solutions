package trees.binary;

import util.TreeNode;

// https://leetcode.com/problems/delete-node-in-a-bst/

public class _450_DeleteNodeInABST {
    public TreeNode deleteNode(TreeNode root, int key) {
        return deleteNodeRecurse(root, key);
    }

    private int getMin(TreeNode node){
        return node.left == null ? node.val : getMin(node.left);
    }

    private TreeNode deleteNodeRecurse(TreeNode node, int key){
        if(node == null){ // Do nothing
            return null;
        }
        if(key < node.val){
            node.left = deleteNodeRecurse(node.left, key);
        }
        else if(key > node.val){
            node.right = deleteNodeRecurse(node.right, key);
        }
        else{ // key == node.key found node to delete
            if(node.left == null){ // The node has no children or only has right child
                return node.right;
            }
            else if(node.right == null){ // The node has only left child
                return node.left;
            }
            else{ // The node has both children
                node.val = getMin(node.right);
                node.right = deleteNodeRecurse(node.right, node.val);
            }
        }
        return node;
    }
}
