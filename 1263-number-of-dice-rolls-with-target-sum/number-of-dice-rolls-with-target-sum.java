class Solution {
    static int DP[][];
    public int numRollsToTarget(int n, int k, int target) {
        DP=new int[n+1][target+1];
        for(int i[] : DP){
            Arrays.fill(i,-1);
        }
        return f(n,target,k);
    }
    static int f(int i,int t,int k){
        if(i==0 || t<0 ){
            return t==0?1:0;
        }
        if(DP[i][t]!=-1){
            return DP[i][t];
        }
        int x=0;
        for(int j=1;j<=k;j++){
            x=(x+f(i-1,t-j,k))%(1000000000+7);
        }
        return DP[i][t]=x;
    }
}