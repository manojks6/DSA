class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0,n=nums.length,i=0,j=0,m=Integer.MAX_VALUE;
        while(j<n){
            sum+=nums[j];
            while(i<=j && sum>=target){
                m=Math.min(j-i+1,m);
                sum-=nums[i++];
            }
            //m=Math.min(j-i+1,m);
            j++;
        }
        return m==Integer.MAX_VALUE?0:m;
    }
}