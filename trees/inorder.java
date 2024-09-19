package trees;

import java.util.ArrayList;
import java.util.Stack;

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

//Recursive approach
class Solution {
    List<Integer> ans=new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return ans;     
    }

    public void inorder(TreeNode node){
        if(node!=null){
            inorder(node.left);
            ans.add(node.val);
            inorder(node.right);

        }
        
    }
}

//Iterative approach
class Solution2{
    public ArrayList<Integer> inorder(TreeNode root){
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();

        if(root==null){
            return ans;
        }
        
        TreeNode node = root;
        
        while(true){
            if(node != null){
                st.push(node);
                node=node.left;
            }
            else{
                if(st.isEmpty()){
                    break;
                }
                node=st.pop(); 
                ans.add(node.val);
                node=node.right;

            }
        }
        return ans;
    }
}