class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p=0,o=1;
        int x[]=new int[nums.length];
        for(int i :nums){
            if(i<0){
                x[o]=i;
                o+=2;
            }else{
                x[p]=i;
                p+=2;
            }
        }
        return x;
    }
}