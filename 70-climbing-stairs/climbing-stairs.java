class Solution {
    public int climbStairs(int n) {
        int DP[]=new int[n+1];
        Arrays.fill(DP,-1);
       return f(n,DP);
    }
    static int f(int n,int[] DP){
        if(n==0){
            return 1;
        }
        if(DP[n]!=-1){
            return DP[n];
        }
        int x=f(n-1,DP);
        int y=n>1?f(n-2,DP):0;
        return DP[n]=x+y;
    }
}