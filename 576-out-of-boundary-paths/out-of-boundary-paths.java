class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int DP[][][]=new int[m][n][maxMove+1];
        for(int i[][]:DP){
            for(int j[]:i){
                Arrays.fill(j,-1);
            }
        }
        return f(startRow, startColumn,maxMove,m,n,DP);
    }
    static int f(int i,int j,int max,int r,int c,int[][][] DP){
        if(max<0){
            return 0;
        }
        if(i<0 || j<0 || i==r || j==c){
            return 1;
        }
        if(DP[i][j][max]!=-1) return DP[i][j][max];
        int m=0;
        m+=f(i-1,j,max-1,r,c,DP);
        m=m%(1000000007);
        m+=f(i,j-1,max-1,r,c,DP);
        m=m%(1000000007);
        m+=f(i+1,j,max-1,r,c,DP);
        m=m%(1000000007);
        m+=f(i,j+1,max-1,r,c,DP);
        m=m%(1000000007);
        return DP[i][j][max]=m;
    }
}