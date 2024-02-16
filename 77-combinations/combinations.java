class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        List<Integer> l=new ArrayList<>();
        f(0,n,k,ans,l);
        return ans;
    }
    static void f(int i,int n,int k,List<List<Integer>> ans,List<Integer> l){
        if(k<0 || i>n){
            return ;
        }
        if(k==0){
            ans.add(new ArrayList<>(l));
            l=new ArrayList<>();
            return;
        }
        
        l.add(i+1);
        f(i+1,n,k-1,ans,l);
        l.remove(l.size()-1);
        f(i+1,n,k,ans,l);
    }
}