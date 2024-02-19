class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1,m=0;
        while(i<j){
            if(m<(nums[i]-1)*(nums[j]-1)){
                m=(nums[i]-1)*(nums[j]-1);
            }
            i++;
        }
        return m;
    }
}