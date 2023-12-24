class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==1|| nums.length==0){
            return nums.length;
        }
        Set<Integer> s=new HashSet<>();
        int m=Integer.MIN_VALUE;
        for(int i:nums){
            s.add(i);
        }
        if(s.size()==1){
            return 1;
        }
        for(int x:s){
            int t=x,c=1;
            while(!s.contains(x-1) && s.contains(t+1)){
                c++;
                t=t+1;
            }
            m=Math.max(c,m);
        }
        return m;
    }
}