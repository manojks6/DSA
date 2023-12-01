class Solution {
    public int uniquePathsWithObstacles(int[][] a) {
        int m=a.length,n=a[0].length;
        // if(m==1 && n==1 &&)
        //     return 0;
        int DP[][]=new int[m][n];
        for(int x[]:DP){
            Arrays.fill(x,-1);
        }
        return f(m-1,n-1,a,DP);
    }
    static int f(int i,int j,int a[][],int[][] DP){
        if(i==0 && j==0 && a[0][0]==0){
            return 1;
        }
        if(i<0 || j<0|| a[i][j]==1){
            return 0;
        }
        if(DP[i][j]!=-1){
            return DP[i][j];
        }
        return DP[i][j]=f(i-1,j,a,DP)+f(i,j-1,a,DP);
    }
}