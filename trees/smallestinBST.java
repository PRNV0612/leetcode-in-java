//230. Kth Smallest Element in a BST


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
    int count=0;
    int ans=-1;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return ans;
    }

    public void inorder(TreeNode node,int k){
        if(node.left!=null){
            inorder(node.left,k);
        }
        count++;
        if(count==k){
            ans=node.val;
            return;
        }
        if(node.right!=null){
            inorder(node.right,k);
        }
        
    }
}