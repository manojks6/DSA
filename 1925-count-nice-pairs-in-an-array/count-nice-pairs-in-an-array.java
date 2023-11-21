class Solution {
    public int countNicePairs(int[] nums) {
        int count=0;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i:nums){
            int x=i-rev(i);
            int c=m.getOrDefault(x,0);
            m.put(x,c+1);
            count=(count+c)%1000000007;
        }
        return count;
    }
    static int rev(int n){
        int res=0;
        while(n>0){
            res=res*10+(n%10);
            n=n/10;
        }
        return res;
    }

}