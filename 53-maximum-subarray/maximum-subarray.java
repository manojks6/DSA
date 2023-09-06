class Solution {
    public int maxSubArray(int[] nums) {
        int m=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            m=Math.max(sum,m);
            sum=sum<0?0:sum;
        }
        return m;
    }
}