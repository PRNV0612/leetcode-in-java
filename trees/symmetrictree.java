//Question 101. Symmetric Tree

//the right child of a node should be equal to the left child of the opposite node(mirrored image)


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return checkSym(root.left,root.right);
    }

    public boolean checkSym(TreeNode n1,TreeNode n2){
        if(n1==null && n2==null) return true;
        if(n1==null || n2==null) return false;
        return n1.val==n2.val && checkSym(n1.left,n2.right) && checkSym(n1.right,n2.left);
    }
}