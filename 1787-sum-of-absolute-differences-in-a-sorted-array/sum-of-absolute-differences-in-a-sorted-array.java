class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int sum=0,total=0,n=nums.length;
        int ans[]=new int[n];
        for(int i:nums){
            total+=i;
        }
        for(int i=0;i<n;i++){
            ans[i]=i*nums[i]-sum + (total-sum)-(n-i)*nums[i];
            sum+=nums[i];
        }
        return ans;
    }
}