class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> ans= new ArrayList<List<Integer>>();
        int n=arr.length,X=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int j=i+1,k=n-1;
            int t=X-arr[i];
            while(j<k){
                List<Integer> l=new ArrayList<>();
                l.add(arr[i]);
                long s=arr[j]+arr[k];
                if(t==s){
                    l.add(arr[j]);
                    l.add(arr[k]);
                    ans.add(new ArrayList(l));
                    j++;
                    k--;
                }
                else if(s<t){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        HashSet<List<Integer>> h=new HashSet<List<Integer>>();
        h.addAll(ans);
        ans.clear();
        ans.addAll(h);
        return ans;
    }
}