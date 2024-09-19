import java.util.ArrayList;
import java.util.Stack;



 //Definition for a binary tree node.
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
 

 //recursive aproach
// class Solution {
//     List<Integer> ans=new ArrayList<>();
//     public List<Integer> preorderTraversal(TreeNode root) {
//         preorder(root);
//         return ans;
//     }

//     public void preorder(TreeNode node){
//         if(node!=null){
//             ans.add(node.val);
//             preorder(node.left);
//             preorder(node.right);
//         }
//     }
// }


//iterative approach

class Solution {
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        if(root==null){
            return ans;
        }
        st.push(root);

        while(!st.empty()){
            root=st.pop();
            ans.add(root.val);

            if(root.right!=null) st.push(root.right);
            if(root.left!=null) st.push(root.left);
                      
        }
        return ans;
    }

}