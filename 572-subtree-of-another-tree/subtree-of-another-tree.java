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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot==null) return true;
        if(root==null){
            return false;
        }
        if(f(root,subRoot)){
            return true;
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    static boolean f(TreeNode t, TreeNode s){
        if(t==null && s==null){
            return true;
        }
        if(t==null || s==null){
            return false;
        }
        if(s.val==t.val){
            return f(t.left,s.left) && f(t.right,s.right);
        }
        return false;
    }
}