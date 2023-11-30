class Solution {
    public int rob(int[] nums) {
        int DP[]=new int[nums.length];
        if(nums.length==1){
            return nums[0];
        }
        DP[0]=nums[0];
        DP[1]=Math.max(nums[1],nums[0]);
        for(int i=2;i<nums.length;i++){
            int x=0;
            if(i>1){
                x=nums[i]+DP[i-2];
            }
            int y=DP[i-1];
            DP[i]=Math.max(x,y);
        }
        return Math.max(DP[nums.length-1],DP[nums.length-2]);
    }
   
}