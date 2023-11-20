class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0,j=0,m=0,c=0;
        while(j<nums.length){
            if(nums[j]==1){
                c++;
            }
            else{
                c=0;   
            }
            if(c>m){
                m=c;
            }
            j++;
        }
        return m;
    }
}