class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        f(0,nums,ans);
        return ans;
    }
    static void f(int i,int nums[], List<List<Integer>> ans){
        if(i==nums.length){
            List<Integer> l=new ArrayList<>();
            for(int x:nums){
                l.add(x);
            }
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int j=i;j<nums.length;j++){
            swap(nums,i,j);
            f(i+1,nums,ans);
            swap(nums,i,j);
        }
    }
    static void swap(int nums[],int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}