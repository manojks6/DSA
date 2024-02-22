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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int flag=0;
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        if(root==null){
            return ans;
        }
        while(!q.isEmpty()){
            ArrayList<Integer> l=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode x=q.peek();
                q.poll();
                if(x.left!=null){
                    q.add(x.left);
                }
                if(x.right!=null){
                    q.add(x.right);
                }
                l.add(x.val);
            }
            if(flag==0){
                ans.add(new ArrayList(l));
            }
            else{
                rev(l);
                ans.add(new ArrayList(l));
            }
            flag^=1;
        }
        return ans;
    }
    static void rev(ArrayList<Integer> l){
        int i=0,j=l.size()-1;
        while(i<j){
            int t=l.get(i);
            l.set(i,l.get(j));
            l.set(j,t);
            i++;
            j--;
        }
    }
}