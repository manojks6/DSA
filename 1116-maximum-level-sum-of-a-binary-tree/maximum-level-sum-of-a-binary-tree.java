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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        int lvl=0,max=Integer.MIN_VALUE,templvl=0;
        if(root==null) return 0;
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size(),sum=0;
            for(int i=0;i<n;i++){
                TreeNode x=q.peek();
                q.poll();
                if(x.left!=null){
                    q.add(x.left);
                }
                if(x.right!=null){
                    q.add(x.right);
                }
                sum+=x.val;
            }
            templvl++;
            if(sum>max){
                max=sum;
                lvl=templvl;
            }
        }
        return lvl;
    }
}