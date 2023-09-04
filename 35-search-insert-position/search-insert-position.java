class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans=nums.length;
        int l=0,h=nums.length-1;
        while(l<=h){
            int m=(h+l)/2;
            if(nums[m]>=target){
                h=m-1;
                ans=m;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
}
