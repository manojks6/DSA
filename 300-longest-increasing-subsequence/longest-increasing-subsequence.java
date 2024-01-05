class Solution {
    static int DP[][];
    public int lengthOfLIS(int[] nums) {
        DP=new int[nums.length][nums.length+1];
        for(int i[]:DP){
            Arrays.fill(i,-1);
        }
        int n=nums.length-1;
        return f(0,-1,nums);
    }
    static int f(int i,int p,int[] a){
        if(i==a.length){
            return 0;
        }
        if(DP[i][p+1]!=-1){
            return DP[i][p+1];
        }
        int x=0,y=0;
        if(p==-1 || a[i]>a[p]){
            x=1+f(i+1,i,a);
        }
        y=f(i+1,p,a);
        return DP[i][p+1]=Math.max(x,y);
    }
}