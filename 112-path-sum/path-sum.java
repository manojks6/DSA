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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return root==null?false:f(targetSum,root);
    }
    static boolean f(int t,TreeNode root){
        if(t==root.val && root.left==null && root.right==null){
            return true;
        }
        else if(root==null){
            return false;
        }
            boolean x=false,y=false;
            if(root.left!=null){
                y=f(t-root.val,root.left);
            }
            if(root.right!=null){
                x=f(t-root.val,root.right);
            }
            return x || y;
        
    }
}