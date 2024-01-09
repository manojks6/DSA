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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> l=new ArrayList<>();
        ArrayList<Integer> m=new ArrayList<>();
        f(root1,l);
        f(root2,m);
        return l.equals(m);
    }
    static void f(TreeNode r1,ArrayList<Integer> l){
        if(r1.right==null && r1.left==null){
            l.add(r1.val);
            return;
        }
        else if (r1.left==null){
            f(r1.right,l);
        }
        else if(r1.right==null){
            f(r1.left,l);
        }
        else{
            f(r1.right,l);
            f(r1.left,l);
        }
    }
}