class Solution {
    public int findMin(int[] nums) {
        int l=0,h=nums.length-1;
        if(nums.length==1){
            return nums[0];
        }
        while(l<h){
            if(nums[l]<nums[h]){
                return nums[l];
            }
            int m=(l+h)/2;
            if(nums[m]>=nums[l]){
                l=m+1;
            }
            else{
                h=m;
            }
        }
        return nums[l];
    }
}