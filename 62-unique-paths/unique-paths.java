class Solution {
    public int uniquePaths(int m, int n) {
        int DP[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0)
                    DP[i][j]=1;
                else
                    DP[i][j]=DP[i][j-1]+DP[i-1][j];
            }
        }
        return DP[m-1][n-1];
    }
    static int f(int i,int j){
        if(i==0 && j==0){
            return 1;
        }
        if(i<0 || j<0){
            return 0;
        }
        int x=f(i-1,j);
        int y=f(i,j-1);
        return x+y;
    }
}