class Solution {
    public boolean search(int[] nums, int x) {
        int n=nums.length,h=n-1,l=0;
        while(l<=h){
            int m=(l+h)/2;
            if(nums[m]==x){
                return true;
            }
            if(nums[m]==nums[l] && nums[l]==nums[h]){
                l++;
                h--;
                continue;
            }
            if(nums[m]>=nums[l]){
                if(nums[l]<=x && nums[m]>x){
                    h=m-1;
                }
                else{
                    l=m+1;
                }
            }
            else{
                if(nums[m]<x && nums[h]>=x){
                    l=m+1;
                }
                else{
                    h=m-1;
                }
            }
        }
        return false;
    }
}