class Solution {
    static int DP[];
    public int jump(int[] nums) {
        DP=new int[nums.length];
        Arrays.fill(DP,-1);
        int jump=f(0,nums);
        return jump==9999?-1:jump;
    }
    static int f(int i,int[] a){
        if(i>=a.length-1){
            return 0;
        }
        if(a[i]==0){
            return 9999;
        }
        if(DP[i]!=-1){
            return DP[i];
        }
        int b=9999;
        int r=i+a[i];
        for(int j=i+1;j<=r;j++){
            b=Math.min(b,f(j,a));
        }
        return DP[i]=1+b;
    }
}