class Solution {
    public int maxProfit(int[] prices, int fee) {
        int DP[][]=new int[prices.length][2];
            for(int x[]:DP){
                Arrays.fill(x,-1);
            }
        return f(0,prices,fee,1,DP);
    }
    static int f(int i,int[] a,int fee,int b,int DP[][]){
        if(i==a.length){
            return 0;
        }
        if(DP[i][b]!=-1){
            return DP[i][b];
        }
        int x=0,y=f(i+1,a,fee,b,DP);
        if(b==1){
             x=-a[i]+f(i+1,a,fee,0,DP);
        }
        else{
            x=a[i]-fee+f(i+1,a,fee,1,DP);
        }       
        return DP[i][b]=Math.max(x,y);
    }
}