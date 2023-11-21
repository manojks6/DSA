class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer,Long> m=new HashMap<>();
        long count=0,n=nums.length;
        for(int i=0;i<nums.length;i++){
            int x=i-nums[i];
            long c=m.getOrDefault(x,(long)0);
            m.put(x,c+1);
            count+=c;
        }
        long y=n*(n-1)/2;
        return y-count;
    }
}