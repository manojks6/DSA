class Solution {
    public int maxSubArray(int[] nums) {
        int m=Integer.MIN_VALUE,s=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>m){
                m=sum;
            }
            if(sum<0) sum=0;
        }
        return m;
    }
}