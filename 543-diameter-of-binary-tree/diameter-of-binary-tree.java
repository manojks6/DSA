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
    public int diameterOfBinaryTree(TreeNode root) {
        int m[]={0};
        int x=f(root,m);
        return m[0];
    }
    static int f(TreeNode root,int m[]){
        if(root==null){
            return 0;
        }
        int l=f(root.right,m);
        int r=f(root.left,m);
        int h=1+Math.max(l,r);
        m[0]=Math.max(m[0],l+r);
        return h;
    }
}