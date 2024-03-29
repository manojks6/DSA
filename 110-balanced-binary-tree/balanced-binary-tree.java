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
    public boolean isBalanced(TreeNode root) {
        return f(root)==-1?false:true;
    }
    static int f(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=f(root.right);
        int r=f(root.left);
        if(l==-1 || r==-1){
            return -1;
        }
        if(Math.abs(l-r)>1){
            return -1;
        }
        return 1+Math.max(l,r);
    }
}