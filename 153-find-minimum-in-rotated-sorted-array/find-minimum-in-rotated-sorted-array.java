class Solution {
    public int findMin(int[] nums) {
        int l=0,h=nums.length-1;
        while(l<h){
            if(nums[l]<nums[h]){
                return nums[l];
            }
            int m=(h+l)/2;
            if(nums[l]<=nums[m]){
                l=m+1;
            }
            else{
                h=m;
            }
        }
        return nums[l];
    }
}